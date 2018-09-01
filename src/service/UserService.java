package service;

import java.sql.SQLException;
import java.util.List;

import entity.Users;

/**
 * 用户信息服务接口
 * @author hxs
 *
 */
public interface UserService {

	//根据景点评论查用户信息
		public List<Users> getUser(int sen_id,int a,int b) throws SQLException;
	//如果有回帖，查看回帖人信息和被回帖人信息
		public List<Users> getReUser(int sen_id,int a,int b) throws SQLException;
    //lyd
		List<Users> getUserList() throws SQLException;
	//qzh
		 boolean UpdateUser(Users users);
}
