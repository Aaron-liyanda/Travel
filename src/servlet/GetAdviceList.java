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
import entity.Advice;

public class GetAdviceList extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
        String sql = "select * from advice";
        List list = null;
		try {
			list = (List) run.query(sql, new BeanListHandler<Advice>(Advice.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}       
		
		request.setAttribute("adviceList", list);
		
		request.getRequestDispatcher("tab_advice.jsp").forward(request, response);
		
	}

}
