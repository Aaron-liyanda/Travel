package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Users;
import entity.son_re;
import net.sf.json.JSON;
import service.SonRemarkService;
import service.impl.SonRemarkServiceImpl;

public class FaServlet extends HttpServlet {

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
		
	SonRemarkService sonRemarkService=new SonRemarkServiceImpl();
		String content=(String) request.getParameter("content");
		int sId=Integer.parseInt(request.getParameter("uId"));
		System.out.println(sId+"content"+"----->"+content);
		
		Users myUsers=(Users) request.getSession().getAttribute("user");
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//(df.format(new Date()))
			Date date=null;
			try {
		      date=(Date) df.parse(df.format(new Date()));
		      son_re re=new son_re();
		      re.setSon_re_content(content);
		      re.setSon_re_date(date);
		      re.setSon_re_my(myUsers.getId());
		      re.setSon_re_to(sId);
			boolean flag=sonRemarkService.makeSon_re(re);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
