package service.impl;

import java.util.List;

import entity.UserMessage;
import service.UserMessageService;

public class UserMessageServiceImpl implements UserMessageService {

	@Override
	public List<UserMessage> getMessageList() {
		// TODO Auto-generated method stub
		UserMessageService userMessageService=new UserMessageServiceImpl();
		List list=userMessageService.getMessageList();
		return list;
	}
}
