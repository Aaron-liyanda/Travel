package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Activity_message;

public interface ActivityMessageDao {
    
	List<Activity_message> getActMsgList() throws SQLException;

	//ly
	// 通过活动id得到活动的留言,按日期排序
	List<Activity_message> getActmsgList(int act_id)  throws SQLException;
	// 创建一个新的活动留言
	int addActmsg(int act_id,int act_msg_fuser,String act_msg_acount) throws SQLException;
	//删除活动留言
	int delActmsg(int act_msg_id) throws SQLException;
}
