package service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dao.PlaceRemarkDao;
import dao.SonRemarkDao;
import dao.UserDao;
import dao.impl.PlaceRemarkDaoImpl;
import dao.impl.SonRemarkDaoImpl;
import dao.impl.UserDaoImpl;
import dbutil.DbUtil;
import entity.Users;
import entity.place_remark;
import entity.son_re;
import service.UserService;

public class UserServiceImpl implements UserService {
  PlaceRemarkDao pla_reDao=new PlaceRemarkDaoImpl();
  UserDao userDao=new UserDaoImpl();
  SonRemarkDao sonDao=new SonRemarkDaoImpl();
	@Override
	//前几条发帖的用户
	public List<Users> getUser(int sen_id,int a,int b) throws SQLException {
		// TODO Auto-generated method stub
		List<place_remark> list=pla_reDao.getReList(sen_id,a, b);
		System.out.println(list.size());
		if(list!=null){
			System.out.println("list不为空");
		List<Users> uList=new ArrayList<Users>();
		List<Users> uList2=new ArrayList<Users>();
		uList=userDao.getUser(sen_id);//查询发帖的用户
		for (int i = 0; i < list.size(); i++) {
			Users users=new Users();
		try{
			if(list.get(i).getPla_re_user()==uList.get(i).getId()){
			users=userDao.getUsers(list.get(i).getPla_re_user());
			uList2.add(users);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			uList2.add(null);
		}
		}
		return uList2;
	
		}
		else{
			return null;
		}
		
	}
	@Override
	//回帖用户
	public List<Users> getReUser(int sen_id,int a, int b) throws SQLException {
		// TODO Auto-generated method stub
		List<place_remark> list=pla_reDao.getReList(sen_id,a, b);
		System.out.println("sonlist"+list.size());
		List<son_re> sonList=new ArrayList();
	    if(list!=null){
		    List<Users> uulist=new ArrayList<Users>();
		    uulist=userDao.getUser(sen_id);//根据景点id查询发帖的用户
		for (int i = 0; i < list.size(); i++) {
			QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		  
		    try{
		    Object []param={uulist.get(i).getId()};
			String sql="SELECT * FROM son_remark WHERE son_re_to=?";
			son_re re=runner.query(sql, param, new BeanHandler<son_re>(son_re.class));
			sonList.add(re);
		    }catch (Exception e) {
				// TODO: handle exception
		    	sonList.add(null);
			}
		    }
		}
	else{
			sonList=null;
		}
		if(sonList!=null){
		List<Users> uuList=new ArrayList<Users>();
		for (int i = 0; i < sonList.size(); i++) {
			Users users2=new Users();	
	    try{
			users2=userDao.getUsers(sonList.get(i).getSon_re_my());
			uuList.add(users2);
		}
			catch (Exception e) {
				// TODO: handle exception
				uuList.add(null);
			}				
			}
		return uuList;
		}
		else{
			return null;
		}
	}
	//lyd
	//所有用户信息
	public List<Users> getUserList() throws SQLException {
		UserDaoImpl userList = new UserDaoImpl();
		List<Users> list = userList.getUserList();
		return list;
	}
	//qzh
	//更新用户信息
	@Override
	public boolean UpdateUser(Users users) {
		boolean flag=false;
		UserDao userDao=new UserDaoImpl();
	    int count;
		try {
			count = userDao.updateUser(users);
			if(count>0){
				flag=true;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return flag;
	}

}
