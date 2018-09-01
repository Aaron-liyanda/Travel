package dao.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.ActivityDao;
import dbutil.DbUtil;
import entity.Activity;

public class ActivityDaoImpl implements ActivityDao {

	@Override
	public List getactivitylist() {
		// TODO Auto-generated method stub
		return null;
	}
    //李沿达
	@Override
	public List<Activity> getActivityList() throws SQLException {
		
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
        String sql = "select * from activity";
        List list = (List) run.query(sql, new BeanListHandler<Activity>(Activity.class));       
		return list;
		
	}
	//qzh
	/*
	 * 查用户已参与的活动
	 * 
	 */
		@Override
		public List getactivityList(int apply_fuser) throws SQLException {
			QueryRunner runner=new QueryRunner(DbUtil.dataSource);
			String sql="select * FROM activity WHERE act_user_id =?";
			Object params[]={apply_fuser};
			List list=runner.query(sql, params, new BeanListHandler(Activity.class));
		
			return list;
	}
		@Override
		public int updateActivity(int act_id) throws SQLException {
			// TODO Auto-generated method stub
			Activity activity=new Activity();
			QueryRunner runner=new QueryRunner(DbUtil.dataSource);
			String sql="update activity set act_apply_amount=act_apply_amount+1 where act_id=?";
			Object params[]={act_id};
			int count=runner.update(sql, params);
			return count;
		}
		//ly
		//按截止时间降序排列活动列表，显示所有活动
		@Override
		public List<Activity> getActList1() throws SQLException {
			QueryRunner run= new QueryRunner(DbUtil.dataSource);
			String sql = "SELECT * FROM activity "
					+ "ORDER BY act_end_date DESC";
			List list = (List) run.query(sql, new BeanListHandler(Activity.class));
			return list;
		}
		//按活动id得到这些活动
		@Override
		public List<Activity> getActList2(int act_id) throws SQLException {
			QueryRunner run= new QueryRunner(DbUtil.dataSource);
			String sql ="SELECT * FROM activity "
					+ "WHERE act_id=? ORDER BY act_end_date DESC";
			Object[] params={act_id};
			List list = (List)run.query(sql, new BeanListHandler(Activity.class),params);
			return list;
		}
		//按截止时间降序排列活动列表，按创建者id得到这些活动
		@Override
		public List<Activity> getActList3(int act_user_id) throws SQLException {
			QueryRunner run= new QueryRunner(DbUtil.dataSource);
			String sql ="SELECT * FROM activity "
					+ "WHERE act_user_id=? ORDER BY act_end_date DESC";
			Object[] params={act_user_id};
			List list = (List)run.query(sql, new BeanListHandler(Activity.class),params);
			return list;
		}
		//根据城市模糊查询活动信息
		@Override
		public List<Activity> getActList4(String act_city)  throws SQLException {
			//创建dbutils下的QueryRunnner
	        QueryRunner runner = new QueryRunner(DbUtil.dataSource);
	        //☆☆☆注意where 1=1后面一定要留空格，否则和后面进行字符串拼接后，到数据库查询会出现错误
	        String sql = "SELECT * FROM activity where 1=1  ";
	        //创建一个集合用来存储查询的参数，因为我们不清楚客户到底输入几个参数，所以用集合来存放
	        List<String> list = new ArrayList<String>();
	        if (act_city != "") {
	            //如果用户输入的act_city不为空，那需要进行字符串拼接
	            sql += "and act_city like ? ";
	            //将用户输入的参数添加到集合
	            list.add("%" + act_city + "%");
	        }
	        //最后将集合转化成数组
	        Object[] params = list.toArray();
	        //调用runner对象的query查询方法，并将集合返回
	        return runner.query(sql, new BeanListHandler<Activity>(Activity.class), params);
		}
		//创建一个新的活动
		@Override
		public int addAct(int act_user_id, String act_name, String act_desc, String act_city, int act_amount,
				int act_apply_amount, Date act_end_date) throws SQLException {
			QueryRunner run=new QueryRunner(DbUtil.dataSource);
			String sql ="insert into activity values(null,?,?,?,?,?,?,now(),?)";	
			Object param[]={act_user_id,act_name,act_desc,act_city,act_amount,act_apply_amount,act_end_date};
			return run.update(sql,param);
		}
		//删除活动
		@Override
		public int delAct(int act_id) throws SQLException {
			QueryRunner run=new QueryRunner(DbUtil.dataSource);
			String sql ="delete from activity where act_id=?";	
			Object param[]={act_id};
			return run.update(sql,param);
		}
		//申请人通过后的活动
		@Override
		public int updateAct(int act_id) throws SQLException {
			QueryRunner run=new QueryRunner(DbUtil.dataSource);
			String sql ="UPDATE activity SET act_apply_amount=act_apply_amount+1 WHERE act_id=?";	
			Object param[]={act_id};
			return run.update(sql,param);
		}	
}
