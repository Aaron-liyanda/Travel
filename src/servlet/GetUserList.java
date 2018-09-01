package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.impl.UserServiceImpl;
import entity.Users;

public class GetUserList extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserServiceImpl userServiceImpl = new UserServiceImpl();
		List<Users> userList = null;
		try {
			userList = userServiceImpl.getUserList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(userList);
		
		request.setAttribute("userList", userList);
		
		request.getRequestDispatcher("tab_user.jsp").forward(request, response);
	}

}
