package service;

import java.sql.SQLException;
import java.util.List;

import entity.Province;
import entity.Senic;

/**
 * 景点服务接口
 * @author hxs
 *
 */
public interface SenicService {
	public Senic getSenic(int sen_id);
	//根据景点查所在省份
	public String getPro(int sen_id) throws SQLException ;
	//根据城市名找景点
		List getSenicByCityName(String cityName);
		//根据景点名称找景点信息
		List getSenicByName(String senicName);
		//lyd
		List<Senic> getSenicList() throws SQLException;
}
