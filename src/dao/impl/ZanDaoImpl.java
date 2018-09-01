package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.ZanDao;
import dbutil.DbUtil;
import entity.Zan;

public class ZanDaoImpl implements ZanDao{

	@Override
	public List<Zan> getZan(int pla_re_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="SELECT * FROM zan WHERE pla_re_id=?";
		Object []param={pla_re_id};
		try{
		List<Zan> zan=runner.query(sql, param, new BeanListHandler<Zan>(Zan.class));
		return zan;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
    //×¢²áµãÔÞ¼ÇÂ¼
	@Override
	public int makeZan(Zan zan) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		Object []param={zan.getPla_re_id(),zan.getUser_id()};
		String sql="INSERT INTO zan VALUE(null,?,?)";
		int count=runner.update(sql, param);
		return count;
	}

}
