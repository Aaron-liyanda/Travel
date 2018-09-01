package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ApplyService;
import service.impl.ApplyServiceImpl;


public class AddActapServlet extends HttpServlet {

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
		
		//取得表单数据     
        String apply_suser=request.getParameter("apply_suser");
        String apply_fuser=request.getParameter("apply_fuser");
        String act_id=request.getParameter("act_id");
        ApplyService service=new ApplyServiceImpl();
        int i=service.addActap( Integer.parseInt(apply_suser), Integer.parseInt(apply_fuser),Integer.parseInt(act_id));

    
        //转向到一个界面
        request.getRequestDispatcher("activity/index.jsp").forward(request, response);//转发getRequestDispatcher

		out.flush();
		out.close();
	}

}
