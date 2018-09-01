package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Apply;

public interface ApplyDao {
	List getapplylist(); //得到申请表
	int deleteapply(int id);//删除申请
	List getapplylist(int apply_suser) throws SQLException; //得到申请表
	//ly
	// 根据接收者id得到活动的申请人列表
	List<Apply> getActapList1(int apply_suser) throws SQLException;
	// 根据申请人id得到活动的申请人列表

	List<Apply> getActapList2(int apply_fuser) throws SQLException;
	// 创建一个新的活动申请人
	int addActap(int apply_suser,int apply_fuser,int act_id) throws SQLException;
	//接受活动申请人
	int acceptActap(int apply_id) throws SQLException;	
	//拒绝活动申请人
	int rejectActap(int apply_id) throws SQLException; 

}
