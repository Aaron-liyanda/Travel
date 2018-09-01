package service;

import java.util.List;

import entity.UserMessage;

/**
 * 用户消息服务接口
 * @author hxs
 *
 */
public interface UserMessageService {

	//qzh
	List<UserMessage> getMessageList();
}
