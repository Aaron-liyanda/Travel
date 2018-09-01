package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import dbutil.DbUtil;

public class DeleteAdvice extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String adv_id = request.getParameter("adv_id");
		
		String sql="DELETE FROM advice WHERE adv_id= ?";
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		Object param[]={adv_id};	
		try {
			run.update(sql,param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("getAdviceList").forward(request, response);
		
	}

}
