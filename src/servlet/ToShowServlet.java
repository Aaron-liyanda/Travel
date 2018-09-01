package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Senic;
import service.SenicService;
import service.TripService;
import service.impl.SenicServiceImpl;
import service.impl.TripServiceImpl;

public class ToShowServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		SenicService senService=new SenicServiceImpl();
		TripService tripService=new TripServiceImpl();
		//
       int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("---->"+id);
		Senic senic=senService.getSenic(id);
		request.getSession().setAttribute("senic", senic);
		request.getRequestDispatcher("mainSenic.jsp").forward(request, response);
	}

}

