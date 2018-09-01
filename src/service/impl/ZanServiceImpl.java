package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.ZanDao;
import dao.impl.ZanDaoImpl;
import entity.Zan;
import service.ZanService;

public class ZanServiceImpl implements ZanService {
	ZanDao zanDao=new ZanDaoImpl();
    //获取赞对象
	@Override
	public List<Zan> getZan(int pla_re_id) throws SQLException {
		// TODO Auto-generated method stub
		return zanDao.getZan(pla_re_id);
	}
	@Override
	public boolean makeZan(Zan zan) throws SQLException {
		// TODO Auto-generated method stub
		int count =zanDao.makeZan(zan);
		boolean flag=false;
		if(count>0){
			flag=true;
		}
		return flag;
	}

}
