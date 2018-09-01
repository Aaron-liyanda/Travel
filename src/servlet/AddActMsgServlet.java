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

import service.ActivityMessageService;
import service.impl.ActivityMessageServiceImpl;



public class AddActMsgServlet extends HttpServlet {

	/**
	 * 添加留言
		
		 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//取得表单数据     
        String act_id=request.getParameter("act_id");
        String act_msg_fuser=request.getParameter("act_msg_fuser");
        String act_msg_acount=request.getParameter("act_msg_acount");
        act_msg_acount = new String(act_msg_acount.getBytes("iso-8859-1"),"utf-8");
        ActivityMessageService service=new ActivityMessageServiceImpl();
	    int i=service.addActmsg( Integer.parseInt(act_id), Integer.parseInt(act_msg_fuser), act_msg_acount);

        //转向到一个界面
        request.getRequestDispatcher("userLoginServlet").forward(request, response);//转发getRequestDispatcher

		out.flush();
		out.close();
	}

}
