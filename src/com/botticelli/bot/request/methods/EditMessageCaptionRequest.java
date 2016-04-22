package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class EditMessageCaptionRequest extends EditMessageReplyMarkupRequest{

	private String caption;
	
	public EditMessageCaptionRequest(long chat_id, int message_id) 
	{
		super(chat_id, message_id);
	}

	public EditMessageCaptionRequest(String channelusername, int message_id) 
	{
		super(channelusername, message_id);
	}

	public EditMessageCaptionRequest(String inline_message_id) 
	{
		super(inline_message_id);
	}

	public String getCaption() 
	{
		return caption;
	}

	public void setCaption(String caption) 
	{
		this.caption = caption;
	}

	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map <String, Object> map = new HashMap<String, Object>();
		map.put("caption", caption);
		return map;
	}
}
