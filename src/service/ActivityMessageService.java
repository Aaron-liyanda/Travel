package service;

import java.util.List;

import entity.Activity_message;

/**
 * 活动消息服务接口
 * @author hxs
 *
 */
public interface ActivityMessageService {

	    // 通过活动id得到活动的留言,按日期排序
		List<Activity_message> getActmsgList(int act_id);
		// 创建一个新的活动留言
		int addActmsg(int act_id,int act_msg_fuser,String act_msg_acount);
		//删除活动留言
		int delActmsg(int act_msg_id);
}
