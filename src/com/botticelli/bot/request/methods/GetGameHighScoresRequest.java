package com.botticelli.bot.request.methods;

import java.util.Map;

public class GetGameHighScoresRequest extends AbstractToSend{

	private long user_id;
	private int message_id;
	
	public GetGameHighScoresRequest(String channelusername, long user_id, int message_id)
	{
		super(channelusername);
		this.user_id = user_id;
		this.message_id = message_id;
	}
	
	
	public GetGameHighScoresRequest(long chat_id, long user_id, int message_id)
	{
		super(chat_id);
		this.user_id = user_id;
		this.message_id = message_id;
	}

	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("user_id", user_id);
		map.put("message_id", message_id);
		return map;
	}
}
