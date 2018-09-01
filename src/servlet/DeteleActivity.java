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

public class DeteleActivity extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("actId");
		
		String sql="DELETE FROM activity WHERE act_id= ?";
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		Object param[]={id};	
		try {
			run.update(sql,param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("getActivityList").forward(request, response);
	}

}
