package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.CityDao;
import dbutil.DbUtil;
import entity.City;

public class CityDaoImpl implements CityDao{

	@Override
	public List getcitylist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addcity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatecity(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletecity(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getPro(String city_name) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT city_pro FROM city WHERE city_name=?";
		Object[] params={city_name};
		City city=runner.query(sql, params,new BeanHandler<City>(City.class));
		return city.getCity_pro();
	}

}
