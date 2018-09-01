package servlet.activity;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ApplyService;
import service.impl.ApplyServiceImpl;



public class UpdateActapServlet extends HttpServlet {

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
		String apply_id=request.getParameter("apply_id");
		ApplyService service=new ApplyServiceImpl();
		int i=service.acceptActap(Integer.parseInt(apply_id));
		request.getRequestDispatcher("getActServlet1").forward(request, response);
		out.flush();
		out.close();
	}

}
