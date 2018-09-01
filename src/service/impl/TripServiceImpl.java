package service.impl;

import java.sql.SQLException;

import dao.TripDao;
import dao.impl.TripDaoImpl;
import entity.Trip;
import service.TripService;

public class TripServiceImpl implements TripService {
   TripDao tripDao=new TripDaoImpl();
	@Override
	//查旅行社信息
	public Trip findTrip(int trip_id) throws SQLException {
		// TODO Auto-generated method stub
		return tripDao.findTrip(trip_id);
	}

}
