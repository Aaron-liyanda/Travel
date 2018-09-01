package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import dbutil.DbUtil;


public class DeleteScene extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("senId");
		
		String sql="DELETE FROM senic WHERE sen_id= ?";
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		Object param[]={id};	
		try {
			run.update(sql,param);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("getSenList").forward(request, response);
		
	}

}
