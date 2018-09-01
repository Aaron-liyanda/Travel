package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Users;
import entity.Zan;
import service.PlaceRemarkService;
import service.ZanService;
import service.impl.PlaceRemarkServiceImpl;
import service.impl.ZanServiceImpl;

public class ZanServlet extends HttpServlet {

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
		PlaceRemarkService pla_reService=new PlaceRemarkServiceImpl();
		ZanService zanService=new ZanServiceImpl();
	    int pla_re_id=Integer.parseInt(request.getParameter("pla_re_id"));
	    int amount=Integer.parseInt(request.getParameter("count"));
	    Users users=(Users) request.getSession().getAttribute("user");
	    try {
			List<Zan> zan=zanService.getZan(pla_re_id);
			if(zan.size()!=0){
			for (int i = 0; i < zan.size(); i++) {
				if(zan.get(i).getUser_id()==users.getId()){//
                   amount=amount-1;
				}
				else{
					Zan zan2=new Zan();
					zan2.setUser_id(users.getId());//
					zan2.setPla_re_id(pla_re_id);
					boolean flag=zanService.makeZan(zan2);
					pla_reService.hit(amount, pla_re_id);
					System.out.println("okokokoko");
					break;
				}
			}
			}
			else{
				Zan zan2=new Zan();
				zan2.setUser_id(users.getId());//
				zan2.setPla_re_id(pla_re_id);
				boolean flag=zanService.makeZan(zan2);
				pla_reService.hit(amount, pla_re_id);
				System.out.println("okokokoko");	
			}
//	    String usId=request.getParameter("usId");
//	    request.getSession().setAttribute("isZan", "a"+usId);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println( amount );
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	
	}
}
