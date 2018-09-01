package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Activity;
import service.impl.ActiveServiceImpl;


public class GetActivityList extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		ActiveServiceImpl impl = new ActiveServiceImpl();
		List<Activity> list = null;
		try {
			list = impl.getActivityList();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		request.setAttribute("activityList", list);
		request.getRequestDispatcher("tab_activity.jsp").forward(request, response);
			
		
		
		
		
	}

}
