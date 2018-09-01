package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Activity;
import entity.Users;
import service.ActivityService;
import service.impl.ActiveServiceImpl;

public class GetActServlet3 extends HttpServlet {

	/**
	 * 按活动创建者id得到所有活动列表
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
		HttpSession session=request.getSession();
		//这是拿全局session
		Users user=(Users)session.getAttribute("act_user");
		ActivityService service=new ActiveServiceImpl();//Integer.parseInt(act_user_id)
		int i=user.getId();
		List<Activity> list=service.getActList3(i);
		request.setAttribute("activity3", list);
		request.getRequestDispatcher("activity/myAct.jsp").forward(request, response);
		out.flush();
		out.close();
		
	}

}
