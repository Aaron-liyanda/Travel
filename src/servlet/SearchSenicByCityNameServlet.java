package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;
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

public class SearchSenicByCityNameServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接受查询数据
		String cityName=(String) request.getParameter("cityName");
		if("".equals(cityName.trim())){
			request.getRequestDispatcher("/WEB-INF/jsp/emptySearch.jsp").forward(request, response);
		}
		else{
		List<Senic> senicList=null;
		String[] pictures=null;
		//处理查询
		SenicService impls=new SenicServiceImpl();
		senicList= impls.getSenicByCityName(cityName);//景点列表

		//根据景点找第一张图片。
		PictureService pictureService=new PictureServiceImpl();
		pictures=pictureService.getPictures(senicList);

		//保存数据,景点列表，对应图片
		//System.out.println("post城市名"+cityName+test+"景点数"+senicList.size());pass
		request.setAttribute("senicList", senicList);
		request.setAttribute("pictures", pictures);//图片集，以查询出的景点顺序排序
		//转向
		request.getRequestDispatcher("/WEB-INF/jsp/senicList.jsp").forward(request, response);
		
	}
	}

}
