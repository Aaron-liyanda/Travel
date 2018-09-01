package service;

import java.util.List;

import entity.Apply;

/**
 * 申请服务接口
 * @author hxs
 *
 */
public interface ApplyService {
	//qzh
	List getapplylist(int apply_suser);	
	//ly
	// 根据接收者id得到活动的申请人列表
	List<Apply> getActapList1(int apply_suser);
	// 根据申请人id得到活动的申请人列表
	List<Apply> getActapList2(int apply_fuser);
	// 创建一个新的活动申请人
	int addActap(int apply_suser,int apply_fuser,int act_id);
	//接受活动申请人
	int acceptActap(int apply_id);	
	//拒绝活动申请人
	int rejectActap(int apply_id);

}
