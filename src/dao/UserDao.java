package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Users;
import entity.son_re;

public interface UserDao {

	//根据景点评论查用户信息
	public List<Users> getUser(int sen_id) throws SQLException;
	//如果有回帖，查看回帖人信息和被回帖人信息
	//通过id找用户
	public Users getUsers(int user_id) throws SQLException;
	List<Users> getUserList() throws SQLException;
	//qzh
	//更新用户信息
	int updateUser(Users users) throws SQLException;
}
