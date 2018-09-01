package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.AdviceDao;
import dbutil.DbUtil;
import entity.Activity;
import entity.Advice;

public class AdviceDaoImpl implements AdviceDao{

	@Override
	public int addAdvice(Advice advice,int user_id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(DbUtil.dataSource);
		String sql="insert into advice values (null,?,?,?)";
		Object []param={advice.getAdv_date(),advice.getAdv_content(),1};
		int count=runner.update(sql, param);
		return count;
	}

}
