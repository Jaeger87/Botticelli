package com.botticelli.bot.request.methods;

import java.util.Map;

public class KickChatMemberRequest extends AbstractToSend{

	private long user_id;
	private long until_date;
	
	public KickChatMemberRequest(long chat_id, long user_id) {
		super(chat_id);
		this.user_id = user_id;
	}

	public KickChatMemberRequest(String channelusername, long user_id) {
		super(channelusername);
		this.user_id = user_id;
	}

	
	public long getUntil_date() 
	{
		return until_date;
	}

	public void setUntil_date(long until_date) 
	{
		this.until_date = until_date;
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("user_id", user_id);
		map.put("until_date", until_date);
		return map;
	}
}
