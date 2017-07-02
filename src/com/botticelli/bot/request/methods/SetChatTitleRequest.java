package com.botticelli.bot.request.methods;

import java.util.Map;

public class SetChatTitleRequest extends AbstractToSend {

	public String title;
	
	public SetChatTitleRequest(long chat_id, String title) 
	{
		super(chat_id);
		this.title = title;
	}
	
	public SetChatTitleRequest(String channelusername, String title) 
	{
		super(channelusername);
		this.title = title;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("title", title);
		return map;
	}
}
