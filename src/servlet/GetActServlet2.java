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

public class GetActServlet2 extends HttpServlet {

	/**
	 * 按活动id得到活动
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

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		//这是拿单一数据
		String act_id=request.getParameter("act_id");
		ActivityService service1=new ActiveServiceImpl();
		List<Activity> activity=service1.getActList2(Integer.parseInt(act_id));
		request.setAttribute("activity2", activity);
		ActivityMessageService service2=new ActivityMessageServiceImpl();
		List list=service2.getActmsgList(Integer.parseInt(act_id));
		request.setAttribute("activityMessage", list);
		request.getRequestDispatcher("activity/act.jsp").forward(request, response);
		out.flush();
		out.close();
		
	}

}
