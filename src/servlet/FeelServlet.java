package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Users;
import entity.place_remark;
import service.PlaceRemarkService;
import service.impl.PlaceRemarkServiceImpl;

public class FeelServlet extends HttpServlet {

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
		Users users=(Users) request.getSession().getAttribute("user");
		int id=Integer.parseInt(request.getParameter("id"));
		PlaceRemarkService service=new PlaceRemarkServiceImpl();
		String content=request.getParameter("content");
		
		
				
	    Date currentTime = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString = formatter.format(currentTime);
	    ParsePosition pos = new ParsePosition(8);
	    Date curr;
		try {
			curr = formatter.parse(dateString);
			place_remark pla_re=new place_remark();
			pla_re.setPla_re_content(content);
			pla_re.setPla_re_date(curr);
			pla_re.setPla_re_user(users.getId());//users.getId()
			pla_re.setPla_re_mark(0);
			pla_re.setSen_id(id);
			boolean flag=service.re_pla_re(pla_re);
			System.out.println(flag);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
