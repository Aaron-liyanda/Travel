package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import dbutil.DbUtil;
import entity.Users;

public class ModifyAdminPwd extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		String newPassword = request.getParameter("newPassword");
		
		String sql="update users set user_pwd=? where user_name=? ";
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		Object param[]={newPassword, ((Users)request.getSession().getAttribute("admin")).getUser_name()};	
		try {
			run.update(sql,param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("changepwd.jsp").forward(request, response);
		
	}

}
