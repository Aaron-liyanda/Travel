package service;

import java.sql.SQLException;
import java.util.List;

import entity.place_remark;

/**
 * 景点评论服务接口
 * @author hxs
 *
 */
public interface PlaceRemarkService {

	//查多少条评论
	public int getRemark(int sen_id) throws SQLException;
	//按时间查前几条评论信息
	public List<place_remark> getReList(int sen_id,int a,int b) throws SQLException;
	//点赞
	public void hit(int amount,int pla_re_id) throws SQLException;
	//注册评论
	public boolean re_pla_re(place_remark place_remark) throws SQLException;
}
