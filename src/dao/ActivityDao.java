package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entity.Activity;

public interface ActivityDao {
	List getactivitylist() throws SQLException;//得到活动的列表
    List<Activity> getActivityList() throws SQLException;
    List getactivityList(int apply_fuser) throws SQLException;//根据申请人查活动
    int updateActivity(int act_id) throws SQLException;
    //ly
	//按截止时间降序排列活动列表，显示所有活动
	List<Activity> getActList1()  throws SQLException;
	//按活动id得到这些活动
	List<Activity> getActList2(int act_id)  throws SQLException;
	//按截止时间降序排列活动列表，按创建者id得到这些活动
	List<Activity> getActList3(int act_user_id)  throws SQLException;
	//根据城市模糊查询活动信息
	List<Activity> getActList4(String act_city)  throws SQLException;
	//创建一个新的活动
	int addAct(int act_user_id,String act_name,String act_desc,String act_city,int act_amount,int act_apply_amount,Date act_end_date) throws SQLException;	
	//删除活动
	int delAct(int act_id) throws SQLException;
	//申请人通过后的活动
	int updateAct(int act_id) throws SQLException;
}
