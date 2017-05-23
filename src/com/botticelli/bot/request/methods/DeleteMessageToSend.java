package com.botticelli.bot.request.methods;

import java.util.Map;

public class DeleteMessageToSend extends AbstractToSend{

	private int message_id;
	
	public DeleteMessageToSend(long chat_id, int message_id) 
	{
		super(chat_id);
		this.message_id = message_id;
	}

	public DeleteMessageToSend(String channelusername, int message_id)
	{
		super(channelusername);
		this.message_id = message_id;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("message_id", message_id);
		return map;
	}
}
