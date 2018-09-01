package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.ActivityMessage;
import dao.impl.ActivityMessageImpl;
import entity.Activity_message;
import service.ActivityMessageService;

public class ActivityMessageServiceImpl implements ActivityMessageService {

	ActivityMessage dao=new ActivityMessageImpl();
	// 通过活动id得到活动的留言,按日期排序
	@Override
	public List<Activity_message> getActmsgList(int act_id){
		try {
			return dao.getActmsgList(act_id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	// 创建一个新的活动留言
	@Override
	public int addActmsg(int act_id, int act_msg_fuser, String act_msg_acount) {
		try {
			return dao.addActmsg(act_id, act_msg_fuser, act_msg_acount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return act_msg_fuser;
		}

		
	}
	//删除活动留言
	@Override
	public int delActmsg(int act_msg_id) {
		try {
			return dao.delActmsg(act_msg_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return act_msg_id;
		}
		
	}
}
