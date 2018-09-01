package service;

import java.sql.SQLException;

import entity.Trip;

/**
 * 旅行社服务接口
 * @author hxs
 *
 */
public interface TripService {

	public Trip findTrip(int trip_id) throws SQLException;
}
