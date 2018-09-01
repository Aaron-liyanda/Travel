package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dao.TripDao;
import dbutil.DbUtil;
import entity.Senic;
import entity.*;

public class TripDaoImpl implements TripDao {

	@Override
	public Trip findTrip(int trip_id) throws SQLException {
		QueryRunner qr = new QueryRunner(DbUtil.dataSource);
        String sql = "select * from trip where trip_id=?";
       Object params[] = {trip_id};
       Trip trip = (Trip) qr.query(sql, params, new BeanHandler(Trip.class));
    return trip;  
	}

}
