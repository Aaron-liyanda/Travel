package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ActivityService;
import service.impl.ActiveServiceImpl;

public class DelActServlet extends HttpServlet {

	/**
	 * 得到所有活动列表
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
		String act_id=request.getParameter("act_id");
		ActivityService service=new ActiveServiceImpl();
		int i=service.delAct(Integer.parseInt(act_id));
		request.getRequestDispatcher("activity/test2.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
