package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Apply;
import entity.Users;
import service.ActivityService;
import service.impl.ActiveServiceImpl;

public class ActivityServlet extends HttpServlet {

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

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Apply apply=new Apply();
		ActivityService activityService=new ActiveServiceImpl();
		//List list=activityService.getactivity(apply_fuser);
		try {
			HttpSession session=request.getSession();
			Users apply_fuser=(Users) session.getAttribute("user");
			List list=activityService.getactivityList(apply_fuser.getId());
			session.setAttribute("list", list);
			request.getRequestDispatcher("showActivity.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
