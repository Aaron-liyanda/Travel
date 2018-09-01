package service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entity.Activity;

/**
 * 活动服务接口
 * @author hxs
 *
 */
public interface ActivityService {

	//lyd
	List<Activity> getActivityList() throws SQLException;
	//qzh
    List getactivityList(int apply_fuser) throws SQLException;
    int UpdateActivity(int act_id) throws SQLException;

    //ly
	//按截止时间降序排列活动列表，显示所有活动
	List<Activity> getActList1();
	//按活动id得到这些活动
	List<Activity> getActList2(int act_id);
	//按截止时间降序排列活动列表，按创建者id得到这些活动
	List<Activity> getActList3(int act_user_id);
	//根据城市模糊查询活动信息
	List<Activity> getActList4(String act_city);
	//创建一个新的活动
	int addAct(int act_user_id,String act_name,String act_desc,String act_city,int act_amount,int act_apply_amount,Date act_end_date);	
	//删除活动
	int delAct(int act_id);
	//申请人通过后的活动
	int updateAct(int act_id);
}
