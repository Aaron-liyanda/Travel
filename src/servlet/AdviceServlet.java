package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Advice;
import entity.Users;
import service.AdviceService;
import service.impl.AdviceServiceImpl;

public class AdviceServlet extends HttpServlet {

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
		request.setCharacterEncoding("utf-8");
		AdviceService adviceService=new AdviceServiceImpl();
		String adv_content=null;
		adv_content=request.getParameter("advice");
	     Date date=null;
	     SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	        HttpSession session=request.getSession();
			Users user_ids=(Users) session.getAttribute("user");
			//int user_id=user_ids.getId();
			
			try {
				date=dateFormat.parse(dateFormat.format(new Date()));
				Advice a=new Advice();
				a.setAdv_date(date);
				a.setAdv_content(adv_content);
				a.setUser_id(1);
				adviceService.addAdvice(a,1);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
