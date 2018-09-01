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

public class DeleteSceneRemark extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String son_re_id = request.getParameter("son_re_id");
		
		String sql="DELETE FROM son_remark WHERE son_re_id= ?";
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		Object param[]={son_re_id};	
		try {
			run.update(sql,param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("getSceneRemarkList").forward(request, response);
		
	}


}
