package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Picture;
import entity.Senic;
import entity.Trip;
import service.PictureService;
import service.SenicService;
import service.TripService;
import service.UserService;
import service.impl.PictureServiceImpl;
import service.impl.SenicServiceImpl;
import service.impl.TripServiceImpl;
import service.impl.UserServiceImpl;

public class mainSenicServlet extends HttpServlet {

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
	   
		SenicService senService=new SenicServiceImpl();
		TripService tripService=new TripServiceImpl();
		//景点
       int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("---->"+id);
		Senic senic=senService.getSenic(id);
		request.getSession().setAttribute("senic", senic);
		
		try {
			//景点省份
		//	String pro=senService.getPro(2);
		//	request.getSession().setAttribute("pro_name", pro);
			//景点推荐旅行社信息
			Trip trip=tripService.findTrip(1);
			request.setAttribute("trip", trip);
			//获取景点的图片
			PictureService picService=new PictureServiceImpl();
			List<Object> pathList=picService.getPicList(id);
			request.setAttribute("first_pic",pathList.get(0));
			request.setAttribute("second_pic",pathList.get(1));
			request.setAttribute("third_pic", pathList.get(2));
			request.getRequestDispatcher("mainInfo.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
