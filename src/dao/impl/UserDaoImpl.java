package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.UserDao;
import dbutil.DbUtil;
import entity.Users;
import entity.son_re;

public class UserDaoImpl implements UserDao{

	@Override
	public List<Users> getUser(int sen_id) throws SQLException {
		// TODO Auto-generated method stub
		//查询发帖的用户
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT * FROM users WHERE id in(SELECT pla_re_user FROM place_remark WHERE sen_id=?)";
		Object param[]={sen_id};
		List<Users> uList=runner.query(sql, param, new BeanListHandler<Users>(Users.class));
		return uList;
	}

	@Override
	//根据id查用户
	public Users getUsers(int user_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT * FROM users WHERE id=?";
		Object []param={user_id};
		Users users=runner.query(sql, param, new BeanHandler<Users>(Users.class));
		return users;
	}
    //李沿达
    //查询所有的用户集合
	@Override
	public List<Users> getUserList() throws SQLException{
		
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
        String sql = "select * from users";
        List list = (List) run.query(sql, new BeanListHandler<Users>(Users.class));       
		return list;
	}
	//qzh
	/*
	 * 根据ID修改用户信息
	 */
	@Override
	public int  updateUser(Users users) throws SQLException {
	Date date=null;
	QueryRunner runner=new QueryRunner(DbUtil.dataSource);
	String sql="update users set user_name=?, user_pwd=? ,user_phone=? ,user_email=? ,user_birthday=?,user_qq=?, user_photo=?, user_address=? where id=?";
	Object params[]={users.getUser_name(),users.getUser_pwd(),users.getUser_phone(),users.getUser_email(),users.getUser_birthday(),users.getUser_qq(),users.getUser_photo(),users.getUser_address(),users.getId()};
	int count=runner.update(sql, params);
	return count;
}
	
}
