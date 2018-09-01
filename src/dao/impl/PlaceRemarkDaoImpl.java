package dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.PlaceRemarkDao;
import dbutil.DbUtil;
import entity.place_remark;

public class PlaceRemarkDaoImpl implements PlaceRemarkDao {
   
	@Override
	//查询多少条评论
	public int getRemark(int sen_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT COUNT(*) from place_remark WHERE sen_id=?";
		Object []param={sen_id};
		//sql,param, new ArrayHandler()
		Object [] result=runner.query(sql, param, new ArrayHandler());
		Long tot=(Long) result[0];
		int num=new Long(tot).intValue();
		return num;
	}
     //按时间显示景点评论
	@Override
	public List<place_remark> getReList(int sen_id,int a, int b) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT * FROM place_remark WHERE sen_id=? ORDER BY pla_re_date DESC  ";
		Object []params={sen_id};
		
		List<place_remark> pla_re_list= (List<place_remark>) runner.query(sql, params, new BeanListHandler<place_remark>(place_remark.class));
		return pla_re_list;
	
		
	}
    //点赞效果
	@Override
	public void hit(int amount, int pla_re_id) throws SQLException {
		// TODO Auto-generated method stub
			QueryRunner runner=new QueryRunner(DbUtil.dataSource);
			String sql="UPDATE place_remark SET pla_re_mark=? WHERE pla_re_id=?";
			Object []param={amount,pla_re_id};
			runner.update(sql, param);
		}
	//注册景点评论
	@Override
	public int registPla_re(place_remark remark) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="INSERT INTO place_remark VALUES(null,?,?,?,?,?)";
		Object param[]={remark.getPla_re_date(),remark.getPla_re_content(),remark.getPla_re_mark(),remark.getPla_re_user(),remark.getSen_id()};
		int count=runner.update(sql, param);
		return count;
	}

	


}
