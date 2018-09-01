package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ApplyService;
import service.impl.ApplyServiceImpl;


public class GetActapServlet1 extends HttpServlet {

	/**
	 * 根据活动id得到申请列表
		 * The doPost method of the servlet. <br>
		
		 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String apply_suser=request.getParameter("apply_suser");
		ApplyService service=new ApplyServiceImpl();
		List list=service.getActapList1(Integer.parseInt(apply_suser));
		request.setAttribute("apply1", list);
		request.getRequestDispatcher("activity/actApply.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
