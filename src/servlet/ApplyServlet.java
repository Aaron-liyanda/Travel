package servlet;

import java.io.IOException;

import entity.Activity;
import entity.Apply;
import entity.Users;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutil.DbUtil;
import service.ApplyService;
import service.impl.ApplyServiceImpl;

public class ApplyServlet extends HttpServlet {

	/**
		 * The doPost method of the servlet. <br>
		 *
		 
		 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          /*
           * 根据登录ID查申请列表
           */
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ApplyService applyService=new ApplyServiceImpl();
		Apply apply=new Apply();
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		Users apply_suser=(Users) session.getAttribute("user");
		List<Apply> list=applyService.getapplylist(apply_suser.getId());
		request.setAttribute("list", list);
		List<Users> list2=new ArrayList<Users>();
		List<Activity> list3=new ArrayList<Activity>();
		try {
		for(int i=0;i<list.size();i++){
		//	String apply_condition= list.get(i).getApply_condition();
			    list.get(i).getApply_fuser();
				QueryRunner runner=new QueryRunner(DbUtil.dataSource);
			    String sql2="select * from users where id=?";
				Object params2[]={list.get(i).getApply_fuser()};
				
					 Users users = runner.query(sql2, params2,new BeanHandler(Users.class));
					Activity activity=new Activity();
					String sql3="select * from activity where act_id=?";
					Object params3[]={list.get(i).getAct_id()};
					 Activity activity2=runner.query(sql3, params3, new BeanHandler(Activity.class));
					 list2.add(users);
					 list3.add(activity2);
				}
					request.setAttribute("list2", list2);
					request.setAttribute("list3", list3);
					request.getRequestDispatcher("apply.jsp").forward(request, response);   
					} catch (SQLException e) {
					e.printStackTrace();
					}			
	}
	}

