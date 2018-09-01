package dao;

import java.sql.SQLException;

import entity.Trip;

public interface TripDao {
   public Trip findTrip(int trip_id) throws SQLException; 
}
