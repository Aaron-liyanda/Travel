package dao;

import java.sql.SQLException;
import java.util.List;

import entity.place_remark;

public interface PlaceRemarkDao {

	//查多少条评论
	public int getRemark(int sen_id) throws SQLException;
	//查前几条评论信息
	public List<place_remark> getReList(int sen_id,int a,int b) throws SQLException;
	//点赞
	public void hit(int amount,int pla_re_id) throws SQLException;
	//注册景点评论信息
	public int registPla_re(place_remark remark) throws SQLException;
}
