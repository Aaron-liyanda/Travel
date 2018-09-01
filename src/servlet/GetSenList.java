package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.impl.SenicServiceImpl;
import entity.Senic;

public class GetSenList extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SenicServiceImpl senicServiceImpl = new SenicServiceImpl();
		List<Senic> senList = senicServiceImpl.getSenicList();
		
		request.setAttribute("senList", senList);
		
		request.getRequestDispatcher("tab_scene.jsp").forward(request, response);
		
	}

}
