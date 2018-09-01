package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.ApplyDao;
import dao.impl.ApplyDaoImpl;
import entity.Apply;
import service.ApplyService;

public class ApplyServiceImpl implements ApplyService {

	//qzh
	ApplyDao applyDao=new ApplyDaoImpl();
	List list=null;
	@Override
	public List getapplylist(int apply_suser) {
		// TODO Auto-generated method stub
		
		try {
			 list = applyDao.getapplylist(apply_suser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//ly
	ApplyDao dao=new ApplyDaoImpl();
	// 根据接收者id得到活动的申请人列表
	@Override
	public List<Apply> getActapList1(int apply_suser){
		try {
			return dao.getActapList1(apply_suser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	// 根据申请人id得到活动的申请人列表
	@Override
	public List<Apply> getActapList2(int apply_fuser) {
		try {
			return dao.getActapList2(apply_fuser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}			
	}
	// 创建一个新的活动申请人
	@Override
	public int addActap(int apply_suser,int apply_fuser,int act_id) {
		try {
			return dao.addActap(apply_suser, apply_fuser,act_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return apply_fuser;
		}
		
	}
	//接受活动申请人
	@Override
	public int acceptActap(int apply_id) {
		try {
			return dao.acceptActap(apply_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return apply_id;
		}
		
	}
	//拒绝活动申请人
	@Override
	public int rejectActap(int apply_id) {
		try {
			return dao.rejectActap(apply_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return apply_id;
		}
		
	}
}
