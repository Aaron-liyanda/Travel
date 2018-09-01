package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Senic;

public interface SenicDao {

	public Senic getSenic(int sen_id) throws SQLException;
	   List<Senic> getSenList();
	//根据城市名找景点
		List getSenicByCityName(String cityName) throws SQLException;
		//根据景点名称找景点信息
		List getSenicByName(String senicName) throws SQLException;
}
