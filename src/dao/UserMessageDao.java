package dao;

import java.util.List;

import entity.UserMessage;

public interface UserMessageDao {

	//qzh
	List<UserMessage> getMessageList() throws Exception;
}
