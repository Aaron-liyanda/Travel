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
import service.SonRemarkService;

public class SonRemarkServiceImpl implements SonRemarkService {
   PlaceRemarkDao pla_reDao=new PlaceRemarkDaoImpl();
   UserDao userDao=new UserDaoImpl();
	SonRemarkDao sonDao=new SonRemarkDaoImpl();
	//获取是否含有评论
	@Override
	public List<son_re> getSon(int sen_id,int a, int b) throws SQLException {
		// TODO Auto-generated method stub
		List<place_remark> list=pla_reDao.getReList(sen_id,a, b);
		System.out.println("sonlist"+list.size());
	if(list!=null){
		  List<son_re> sonList=new ArrayList();
		  List<Users> uulist=new ArrayList<Users>();
		  uulist=userDao.getUser(sen_id);//根据景点id查询发帖的用户
		for (int i = 0; i < list.size(); i++) {
			QueryRunner runner=new QueryRunner(DbUtil.dataSource);

		    try{
			Object []param={uulist.get(i).getId()};
			String sql="SELECT * FROM son_remark WHERE son_re_to=?";
			son_re re=runner.query(sql, param, new BeanHandler<son_re>(son_re.class));
			sonList.add(re);
		    }
		    catch (Exception e) {
				// TODO: handle exception
		    	sonList.add(null);
			}
		}
		return sonList;
		}
	else{
			return null;
		}
	}
	//注册景点
	@Override
	public boolean makeSon_re(son_re re) throws SQLException {
		// TODO Auto-generated method stub
		int count=sonDao.makeSon_re(re);
		boolean flag=false;
		if(count>0){
			flag=true;
		}
		return flag;
	}
	//qzh
	@Override
	public List getSonRemark(int son_re_to) throws SQLException {
		//SonRemarkService remarkService=new SonRemarkServiceImpl();
		SonRemarkDao remarkDao=new SonRemarkDaoImpl();
		List list=remarkDao.getSonRemark(son_re_to);
		return list;
	}

}
