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

public class DeleteActivityRemark extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String act_msg_id = request.getParameter("act_msg_id");
		
		String sql="DELETE FROM activity_message WHERE act_msg_id= ?";
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		Object param[]={act_msg_id};	
		try {
			run.update(sql,param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("getActivityRemarkList").forward(request, response);
		
	}

}
