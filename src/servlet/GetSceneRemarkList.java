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
import entity.son_re;

public class GetSceneRemarkList extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
        String sql = "select * from son_remark";
        List list = null;
		try {
			list = (List) run.query(sql, new BeanListHandler<son_re>(son_re.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}       
		
		request.setAttribute("son_re_list", list);
		
		request.getRequestDispatcher("tab_remark_scene.jsp").forward(request, response);
		
	}

}
