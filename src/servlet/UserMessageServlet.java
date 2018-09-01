package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import entity.Users;
import service.UserMessageService;
import service.impl.UserMessageServiceImpl;

public class UserMessageServlet extends HttpServlet {

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
    ResultSet rs=null;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset:UTF-8");
		request.setCharacterEncoding("UTF-8");
		UserMessageService usermessageservice=new UserMessageServiceImpl();
		Users u =(Users) request.getSession().getAttribute("user");
		if(u!=null){
			rs=(ResultSet) usermessageservice.getMessageList();
		}
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
	    out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
