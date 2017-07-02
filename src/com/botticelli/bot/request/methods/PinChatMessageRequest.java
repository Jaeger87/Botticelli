package com.botticelli.bot.request.methods;

import java.util.Map;

public class PinChatMessageRequest extends AbstractToSend{

	private int message_id;
	private boolean disable_notification;
	
	
	public PinChatMessageRequest(long chat_id, int message_id) 
	{
		super(chat_id);
		this.message_id = message_id;
	}

	
	public PinChatMessageRequest(String channelusername, int message_id) 
	{
		super(channelusername);
		this.message_id = message_id;
	}
	
	public void disableNotification()
	{
		disable_notification = true;
	}
	
	public void activeNotification()
	{
		disable_notification = false;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("message_id", message_id);
		map.put("disable_notification", disable_notification);
		return map;
	}
}
