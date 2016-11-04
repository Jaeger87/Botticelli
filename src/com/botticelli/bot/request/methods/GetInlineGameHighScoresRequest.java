package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class GetInlineGameHighScoresRequest implements Request{

	private long user_id;
	private String inline_message_id;
	
	
	public GetInlineGameHighScoresRequest(long user_id, String inline_message_id) 
	{
		this.user_id = user_id;
		this.inline_message_id = inline_message_id;
	}


	@Override
	public Map<String, Object> getValuesMap() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("user_id", user_id);
		map.put("inline_message_id", inline_message_id);
		return map;
	}
	
	
}
