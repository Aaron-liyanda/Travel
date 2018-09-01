package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.SenicDao;
import dbutil.DbUtil;
import entity.Senic;

public class SenicDaoImpl implements SenicDao {

	@Override
	public Senic getSenic(int sen_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(DbUtil.dataSource);
		          String sql = "select * from senic where sen_id=?";
		         Object params[] = {sen_id};
		         Senic senic = (Senic) qr.query(sql, params, new BeanHandler(Senic.class));
		      return senic;  
		      }
	//李沿达
	@Override
	public List<Senic> getSenList() {
		List<Senic> senList = new ArrayList();
		try {
			Connection con = DbUtil.getConnection();
			String sql = "select * from senic;";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set = ps.executeQuery();
			while(set.next()){
				Senic sen = new Senic();
				sen.setSen_id(set.getInt("sen_id"));
				sen.setSen_name(set.getString("sen_name"));
				sen.setSen_city(set.getString("sen_city"));
				sen.setSen_desc(set.getString("sen_desc"));
				
				senList.add(sen);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return senList;
	}
	//hexingshi
	public List getSenicByCityName(String cityName) throws SQLException {
		//根据城市名字找景点
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="select * from senic where sen_city like ?";
		cityName="%"+cityName+"%";
		Object param[]={cityName};
		 List list = (List) runner.query(sql,param,new BeanListHandler<Senic>(Senic.class));   
		return list;
	}

	
	public List getSenicByName(String senicName) throws SQLException {
		//根据景点名找景点
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="select * from senic where sen_name like ?";
		senicName="%"+senicName+"%";
		Object param[]={senicName};
		 List list = (List) runner.query(sql, new BeanListHandler(Senic.class),param);   
		return list;
	}
	

}
