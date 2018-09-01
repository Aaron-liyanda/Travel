package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dbutil.DbUtil;
import entity.Users;

public class UserLogin extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String auto_login = request.getParameter("auto_login");
		
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
		String sql = "select * from users where user_name='"+username+"' && user_pwd='"+password+"'" ;
		Users user = null;
		try {
			user = run.query(sql, new BeanHandler<Users>(Users.class));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		if(user != null){
			//设置cookie
//			if("1".equals(auto_login)){
//				Cookie cookie_name = new Cookie("username",username);
//				cookie_name.setMaxAge(3600);
//				Cookie cookie_pwd = new Cookie("password",password);
//				cookie_pwd.setMaxAge(3600);
//				response.addCookie(cookie_name);
//				response.addCookie(cookie_pwd);
//			}
			
			
			if(user.getIdentity() == 1){
				request.getSession().setAttribute("admin", user);
				request.getRequestDispatcher("index.html").forward(request, response);
			}else{
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}else{
			String message = "账号输入有误，请重新输入！";
			request.setAttribute("message", message);
			request.getRequestDispatcher("userLogin.jsp").forward(request, response);
		}
		

	}

}
