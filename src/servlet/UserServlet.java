package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import entity.Users;
import service.UserService;
import service.impl.UserServiceImpl;

public class UserServlet extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService=new UserServiceImpl();
        response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		//Users id=(Users) session.getAttribute("user");
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd" ); 
		Date date=null;
		String userName = null;
		String userPwd = null;
	    String userPhone = null;
		String userEmail=null;
		String year = null;
		String month = null;
		String userAdr=null;
		String day = null;
		Date user_birthday;
		String userQQ = null;
		String user_photo = null;
		Boolean bool= ServletFileUpload.isMultipartContent(request);
		System.out.println("bool--->"+bool);
		if(bool){
			FileItemFactory factory=new DiskFileItemFactory();
			ServletFileUpload parser=new ServletFileUpload(factory);
			//List<FileItem> fileItems;
			try {
				List<FileItem> fileItems = parser.parseRequest(request);
				for (FileItem fileItem : fileItems) {
					   if(fileItem.isFormField()){
						System.out.println("name--->"+fileItem.getFieldName());
			
						if(fileItem.getFieldName().equals("userName")){
							userName=fileItem.getString();
						}
						if(fileItem.getFieldName().equals("act_city")){
							 userAdr=fileItem.getString("UTF-8");
						}
						if(fileItem.getFieldName().equals("userPwd")){
							userPwd=fileItem.getString("UTF-8");
						}
						if(fileItem.getFieldName().equals("userPhone")){
							userPhone=fileItem.getString("UTF-8");
						}
						if(fileItem.getFieldName().equals("userEmail")){
							userEmail=fileItem.getString("UTF-8");
						}
						if(fileItem.getFieldName().equals("userQQ")){
							userQQ =fileItem.getString("UTF-8");
						}
						if(fileItem.getFieldName().equals("year")){
							 year=fileItem.getString();
						}
						if(fileItem.getFieldName().equals("month")){
							 month=fileItem.getString();
						}
						if(fileItem.getFieldName().equals("day")){
							 day=fileItem.getString();
						}
					}
				
					else{
						String fileName=fileItem.getName();
						if(fileName.contains("/")){
							fileName=fileName.substring(fileName.lastIndexOf("/")+1);
						System.out.println("filenemae"+fileName);
						}
					
					String sufix=fileName.substring(fileName.lastIndexOf("."));
					String newFileName=new java.util.Date().getTime()+sufix;
					File file = new File("C:\\servers\\apache-tomcat-7.0.69\\webapps\\travel\\images\\"+newFileName);
                 
					fileItem.write(file);
					user_photo="images/"+newFileName;
				}
				}
				    String str=year+"-"+month+"-"+day;
				    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
				    
				    user_birthday= new Date(format.parse(str).getTime());// ∫¡√Îµƒ ±º‰
				   String userAdder=new String(userAdr.getBytes("iso-8859-1"),"utf-8");
				    Users u=(Users) request.getSession().getAttribute("user");
				    u.setId(u.getId());
				    u.setUser_name(userName);
					u.setUser_pwd(userPwd);
					u.setUser_phone(userPhone);
					u.setUser_email(userEmail);
					u.setUser_birthday(user_birthday);
					u.setUser_qq(userQQ);
					u.setUser_photo(user_photo);
					u.setUser_address(userAdr);
					userService.UpdateUser(u);
			//request.getRequestDispatcher("index.jsp").forward(request, response);
					//response.sendRedirect("");
					request.getRequestDispatcher("home.jsp").forward(request, response);
			}catch (FileUploadException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			
			}
		}
}
}
