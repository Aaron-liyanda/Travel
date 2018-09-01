package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PictureService;
import service.SenicService;
import service.impl.PictureServiceImpl;
import service.impl.SenicServiceImpl;
import dao.SenicDao;
import dao.impl.SenicDaoImpl;
import entity.Picture;
import entity.Senic;
public class SearchSenicByNameServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		this.doPost(request, response);
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//接受查询数据
		String searchSenic=req.getParameter("senicName");
		if("".equals(searchSenic.trim())){
			req.getRequestDispatcher("/WEB-INF/jsp/emptySearch.jsp").forward(req, resp);
		}
		else{
		String[] pictures=null;
		//处理查询
		SenicService senicService=new SenicServiceImpl();
		List<Senic> senicList=senicService.getSenicByName(searchSenic);
		//根据景点找展示的第一张图片。
		PictureService pictureService=new PictureServiceImpl();
		pictures=pictureService.getPictures(senicList);
		//保存数据,景点列表，对应图片		
		req.setAttribute("senicList", senicList);
		req.setAttribute("pictures", pictures);//图片集，以查询出的景点顺序排序
		//转向
		req.getRequestDispatcher("/WEB-INF/jsp/senicList.jsp").forward(req, resp);
		
	}
	}

}
