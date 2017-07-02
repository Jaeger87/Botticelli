package com.botticelli.bot.request.methods;

import java.util.Map;

public class SetChatDescriptionRequest extends AbstractToSend{

	public String description;
	
	public SetChatDescriptionRequest(long chat_id, String description) 
	{
		super(chat_id);
		this.description = description;
	}
	
	public SetChatDescriptionRequest(String channelusername, String description) 
	{
		super(channelusername);
		this.description = description;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("description", description);
		return map;
	}
}
