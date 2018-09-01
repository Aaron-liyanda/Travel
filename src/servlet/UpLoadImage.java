package servlet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dbutil.DbUtil;
import entity.Picture;
import entity.Senic;

public class UpLoadImage extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String sen_name = null;
		String sen_desc = null;
		String sen_city = null;
		String sen_phone = null;
		String path=null;
		List<String> pic_list =  new ArrayList();
		boolean bool = ServletFileUpload.isMultipartContent(request);
		if(bool){
			DiskFileItemFactory factory = new DiskFileItemFactory();    
			ServletFileUpload parse = new ServletFileUpload(factory);
			parse.setHeaderEncoding("UTF-8");
			try {
				List<FileItem> list = parse.parseRequest(request);
				
				for (FileItem item : list) {
					if(item.isFormField()){

						String name = item.getFieldName();
						if("sen_name".equals(name)){
							sen_name = item.getString("UTF-8");
						}else if("finalCity".equals(name)){
							sen_city =item.getString("UTF-8") ;
						}else if("sen_desc".equals(name)){
							sen_desc = item.getString("UTF-8");
						}else if("sen_phone".equals(name)){
							sen_phone = item.getString("UTF-8");
						}
						
					}else{
						String fileName=item.getName();
						if(fileName.contains("/")){
							fileName=fileName.substring(fileName.lastIndexOf("/")+1);
						//System.out.println("filenemae"+fileName);
						}
					//给图片生成随机名
					String sufix=fileName.substring(fileName.lastIndexOf("."));
					String newFileName=new java.util.Date().getTime()+sufix;
					File file = new File("C:\\servers\\apache-tomcat-7.0.69\\webapps\\travel\\images\\"+newFileName);

					try {
						item.write(file);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 path="images/"+newFileName;
					 pic_list.add(path);
					 
					}
					
				}
				
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
		}
		

		String sql="insert into senic (sen_name, sen_desc, sen_city, sen_phone) values(?, ?, ?, ?) ";
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		Object param[]={sen_name, sen_desc, sen_city, sen_phone};	
		try {
			if(sen_name != null && sen_desc != null && sen_city != null){
				run.update(sql,param);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		QueryRunner run_pic= new QueryRunner(DbUtil.dataSource);
        String sql_pic = "select * from senic where sen_name=?";
        Senic sen = null;
        Object []par={sen_name};
		try {
			sen = run_pic.query(sql_pic,par,new BeanHandler<Senic>(Senic.class));
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		

		for (String pic : pic_list) {
			String sql_p="insert into picture (pic_path, sen_id) values(?, ?) ";
			QueryRunner run_p=new QueryRunner(DbUtil.dataSource);
			if(pic!= null && sen.getSen_id() != 0){
				Object param_p[]={pic, sen.getSen_id()};	
				try {
					run_p.update(sql_p,param_p);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		request.getRequestDispatcher("addScene.jsp").forward(request, response);
		
		
	}
}
