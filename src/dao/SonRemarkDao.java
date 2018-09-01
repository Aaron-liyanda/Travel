package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Users;
import entity.son_re;

public interface SonRemarkDao {

	    //查询用户是否有回复评论
		public List<son_re> getSon(int sen_id,int a,int b) throws SQLException;
	    //根据子回复表查找回帖人id
		public son_re getSonMy(int son_re_my) throws SQLException;
		//回帖
		public int makeSon_re(son_re re) throws SQLException;
		//qzh
		 List getSonRemark(int son_re_to) throws SQLException;
		
}
