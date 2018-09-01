package service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dao.CityDao;
import dao.SenicDao;
import dao.impl.CityDaoImpl;
import dao.impl.SenicDaoImpl;
import dbutil.DbUtil;
import entity.Senic;
import service.SenicService;

public class SenicServiceImpl implements SenicService {
    SenicDao senDao=new SenicDaoImpl();
    CityDao cityDao=new CityDaoImpl();
	@Override
	//拿到景点的信息
	public Senic getSenic(int sen_id)  {
		// TODO Auto-generated method stub
		Senic senic=null;
		try {
			 senic=senDao.getSenic(sen_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return senic;
	}
	//根据景点的城市名拿到省份名
	@Override
	public String getPro(int sen_id) throws SQLException {
		// TODO Auto-generated method stub
		Senic senic=senDao.getSenic(sen_id);
		senic.getSen_city();
		String pro=cityDao.getPro(senic.getSen_city());
		return pro;
	}
	public List getSenicByCityName(String cityName) {
		SenicDao senicDao=new SenicDaoImpl();
		List senicList=null;
		try {
			senicList = senicDao.getSenicByCityName(cityName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return senicList;//景点实体链表
	}

	
	public List getSenicByName(String senicName)  {
		SenicDao senicDao=new SenicDaoImpl();
		List senicList=null;
		try {
			senicList = senicDao.getSenicByName(senicName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return senicList;//景点实体链表
	}
     
	//lyd
	public List<Senic> getSenicList(){
		SenicDaoImpl sd = new SenicDaoImpl();
		List<Senic> list = sd.getSenList();
		return list;
	}

}
