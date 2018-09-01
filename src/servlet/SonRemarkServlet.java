package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutil.DbUtil;
import entity.Apply;

import entity.Users;
import entity.son_re;
import service.SonRemarkService;
import service.UserService;
import service.impl.SonRemarkServiceImpl;
import service.impl.UserServiceImpl;

public class SonRemarkServlet extends HttpServlet {

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		SonRemarkService remarkService=new SonRemarkServiceImpl();
         UserService userService=new UserServiceImpl();
         son_re son_re=new son_re();
		HttpSession session=request.getSession();
	   Users users2=(Users) session.getAttribute("user");
		List<Users> list6=new ArrayList<Users>();
		try {
			List<son_re> list=remarkService.getSonRemark(users2.getId());//
	
			for(int i=0;i<list.size();i++){
				Users users=new Users();
				QueryRunner runner=new QueryRunner(DbUtil.dataSource);
				//int id=list.get(i).getSon_re_my();
				    String sql2="select * from users where id=?";
					Object params2[]={list.get(i).getSon_re_my()};
					 users=runner.query(sql2, params2, new BeanHandler<Users>(Users.class));
					 System.out.println("ccccc"+users.toString());
					list6.add(users);
			}
			request.setAttribute("list", list);
			request.setAttribute("list6",list6);
			request.getRequestDispatcher("sonremark.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	
	}

}
