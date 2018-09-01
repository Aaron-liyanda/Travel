package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutil.DbUtil;
import entity.Users;

public class AdminLogin extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username + password);
		
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
        String sql = "select * from users where identity = 1";
        List<Users> list = null;
        try {
			list = (List<Users>) run.query(sql, new BeanListHandler<Users>(Users.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}  
        for (Users user : list) {
        	if(username != null && password != null){
        		if(username.equals(user.getUser_name()) && password.equals(user.getUser_pwd())){
        			request.getRequestDispatcher("index.html").forward(request, response);
        		}else{
        			String message = "账号输入有误，请重新输入！";
        			request.setAttribute("message", message);
        			request.getRequestDispatcher("backstageLogin.jsp").forward(request, response);
        		}
        	}else{
        		String message = "账号输入有误，请重新输入！";
    			request.setAttribute("message", message);
        		request.getRequestDispatcher("backstageLogin.jsp").forward(request, response);
        	}
			
		}

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();

	}

}
