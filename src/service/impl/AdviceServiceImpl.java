package service.impl;

import java.sql.SQLException;

import dao.AdviceDao;
import dao.impl.AdviceDaoImpl;
import entity.Advice;
import service.AdviceService;

public class AdviceServiceImpl implements AdviceService {

	@Override
	public int addAdvice(Advice advice,int user_id) {
		// TODO Auto-generated method stub
		AdviceDao adviceDao=new AdviceDaoImpl();
		int count =0;
		try {
			 count=adviceDao.addAdvice(advice,user_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
