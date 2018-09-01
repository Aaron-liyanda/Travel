package dao;

import java.sql.SQLException;

import entity.Advice;

public interface AdviceDao {
   int addAdvice(Advice advice,int user_id) throws SQLException;
}
