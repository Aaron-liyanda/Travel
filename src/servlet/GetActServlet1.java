package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Activity;
import service.ActivityMessageService;
import service.ActivityService;
import service.impl.ActiveServiceImpl;
import service.impl.ActivityMessageServiceImpl;

public class GetActServlet1 extends HttpServlet {


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		ActivityService service=new ActiveServiceImpl();
		List<Activity> list=service.getActList1();
		request.setAttribute("activity1", list);
		request.getRequestDispatcher("activity/allAct.jsp").forward(request, response);
		out.flush();
		out.close();
		
	}

}
