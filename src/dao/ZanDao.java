package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Zan;

public interface ZanDao {

	//根据评论id获取赞对象
	public List<Zan> getZan(int pla_re_id) throws SQLException;
	//注册点赞事件
	public int makeZan(Zan zan) throws  SQLException;
}
