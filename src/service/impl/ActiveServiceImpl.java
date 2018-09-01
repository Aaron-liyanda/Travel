package service.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import dao.ActivityDao;
import dao.impl.ActivityDaoImpl;
import entity.Activity;
import service.ActivityService;

public class ActiveServiceImpl implements ActivityService {

	 ActivityDao activityDao=new ActivityDaoImpl();
	//lyd
	@Override
	public List<Activity> getActivityList() throws SQLException {
		ActivityDaoImpl activityList = new ActivityDaoImpl();
		List<Activity> list = activityList.getActivityList();
		return list;
	}
	
	public static void main(String[] args) {
		ActivityDaoImpl activityList = new ActivityDaoImpl();
		List<Activity> list = null;
		try {
			list = activityList.getActivityList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
	}
	//qzh
	@Override
	public List getactivityList(int apply_fuser) throws SQLException {
		
		  List list=activityDao.getactivityList(apply_fuser);
		  return list;
	}

	@Override
	public int UpdateActivity(int act_id) throws SQLException {
		int count=activityDao.updateActivity(act_id);
	    return count;
	}
	ActivityDao dao=new ActivityDaoImpl();
	//按截止时间降序排列活动列表，显示所有活动
	@Override
	public List<Activity> getActList1() {		
		try {
			return dao.getActList1();
		} catch (SQLException e) {
			return null;
		}		
	}
	//按活动id得到这些活动
	@Override
	public List<Activity> getActList2(int act_id) {
		try {
			return dao.getActList2(act_id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	//按截止时间降序排列活动列表，按创建者id得到这些活动
	@Override
	public List<Activity> getActList3(int act_user_id) {
		try {
			return dao.getActList3(act_user_id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	//创建一个新的活动
	@Override
	public int addAct(int act_user_id, String act_name, String act_desc, String act_city, int act_amount,
			int act_apply_amount, Date act_end_date) {
		if(act_name == null||act_desc == null||act_city == null||act_amount == 0||act_end_date == null){
			throw new RuntimeException("用户对象不能为空");
		}
		try {
			dao.addAct(act_user_id, act_name, act_desc, act_city, act_amount, act_apply_amount, act_end_date);
			return 1;
		} catch (SQLException e) {
			return 0;
		}						
	}
	//删除活动
	@Override
	public int delAct(int act_id) {
		try {
			return dao.delAct(act_id);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	//申请人通过后的活动
	@Override
	public int updateAct(int act_id) {
		try {
			return dao.updateAct(act_id);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}//根据城市模糊查询活动信息
	@Override
	public List<Activity> getActList4(String act_city) {
		try {
			return dao.getActList4(act_city);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
