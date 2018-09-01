package dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.UserMessageDao;
import dbutil.DbUtil;
import entity.UserMessage;

public class UserMessageDaoImpl implements UserMessageDao {

	//qzh
	@Override
	public List getMessageList() throws Exception {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT * FROM user_message where um_getId=?";
		List list = (List)runner.query(sql, new BeanListHandler<UserMessage> (UserMessage.class));
		return list;
		
	}

}
