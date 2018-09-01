package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.ActivityMessage;
import dao.ActivityMessageDao;
import dbutil.DbUtil;
import entity.Activity_message;

public class ActivityMessageImpl implements ActivityMessageDao, ActivityMessage {

	@Override
	public List<Activity_message> getActMsgList() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT * FROM activity_message";
		List list = (List) runner.query(sql, new BeanListHandler<Activity_message> (Activity_message.class) );
		return list;
	}
	//ly
	// 通过活动id得到活动的留言,按日期排序
		@Override
		public List<Activity_message> getActmsgList(int act_id) throws SQLException {
			QueryRunner run= new QueryRunner(DbUtil.dataSource);
			String sql ="SELECT * FROM activity_message "
					+ "WHERE act_id=? ORDER BY act_msg_date DESC";
			Object[] params={act_id};
			List list=(List)run.query(sql, new BeanListHandler(Activity_message.class),params);
			return list;
		}
		// 创建一个新的活动留言
		@Override
		public int addActmsg(int act_id, int act_msg_fuser, String act_msg_acount) throws SQLException {
			QueryRunner run=new QueryRunner(DbUtil.dataSource);
			String sql ="INSERT INTO activity_message VALUES(null,?,?,?,NOW())";	
			Object param[]={act_id,act_msg_fuser,act_msg_acount};
			return run.update(sql,param);
		}
		//删除活动留言
		@Override
		public int delActmsg(int act_msg_id) throws SQLException {
			QueryRunner run=new QueryRunner(DbUtil.dataSource);
			String sql ="DELETE FROM activity_message WHERE act_msg_id=?";	
			Object param[]={act_msg_id};
			return run.update(sql,param);
		}


}
