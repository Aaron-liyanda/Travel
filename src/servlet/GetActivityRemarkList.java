package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutil.DbUtil;
import entity.Activity_message;

public class GetActivityRemarkList extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		QueryRunner run= new QueryRunner(DbUtil.dataSource);
        String sql = "select * from activity_message";
        List list = null;
		try {
			list = (List) run.query(sql, new BeanListHandler<Activity_message>(Activity_message.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}       
		
		request.setAttribute("act_mes_list", list);
		
		request.getRequestDispatcher("tab_remark_activity.jsp").forward(request, response);
		
	}

}
