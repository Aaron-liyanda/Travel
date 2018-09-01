package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.PlaceRemarkDao;
import dao.impl.PlaceRemarkDaoImpl;
import entity.place_remark;
   
public class PlaceRemarkServiceImpl implements service.PlaceRemarkService {
    PlaceRemarkDao pla_re_Dao=new PlaceRemarkDaoImpl();
    //获取前多少条评论
	@Override
	public List<place_remark> getReList(int sen_id,int a, int b) throws SQLException {
		// TODO Auto-generated method stub
		return pla_re_Dao.getReList(sen_id,a, b);
	}
	@Override
	//查看多少条评论
	public int getRemark(int sen_id) throws SQLException {
		// TODO Auto-generated method stub
		return pla_re_Dao.getRemark(sen_id);
	}
	@Override
	//点赞
	public void hit(int amount, int pla_re_id) throws SQLException {
		// TODO Auto-generated method stub
		pla_re_Dao.hit(amount, pla_re_id);
	}
	//注册景点评论
	@Override
	public boolean re_pla_re(place_remark place_remark) throws SQLException {
		// TODO Auto-generated method stub
		boolean flag=false;
		int count=pla_re_Dao.registPla_re(place_remark);
		if(count>0){
			flag=true;
		}
		return flag;
	}

}
