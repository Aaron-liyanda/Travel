package dao;

import java.sql.SQLException;
import java.util.List;

public interface CityDao {
	List getcitylist();//获取所有城市列表
	int addcity();//添加城市方法
	int updatecity(int id);//修改城市方法
	int deletecity(int id);//删除城市方法
	String getPro(String city_name) throws SQLException;

}
