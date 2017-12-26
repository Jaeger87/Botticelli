package com.botticelli.bot.request.methods;

import java.util.Map;

public class LiveLocationToEdit extends EditMessageReplyMarkupRequest{

	private float latitude;
	private float longitude;
	
	
	public LiveLocationToEdit(long chat_id, int message_id) 
	{
		super(chat_id, message_id);
	}
	
	public LiveLocationToEdit(String inline_message_id) 
	{
		super(inline_message_id);
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("latitude", new Float(latitude));
		map.put("longitude", new Float(longitude));
		return map;
	}
}
