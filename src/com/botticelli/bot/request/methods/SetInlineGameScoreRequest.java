package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class SetInlineGameScoreRequest implements Request{

	private long user_id;
	private int score;
	private int message_id;
	private boolean edit_message;
	private String inline_message_id;
	
	
	
	public SetInlineGameScoreRequest(String inline_message_id, long user_id, int score)
	{
		this.user_id = user_id;
		this.score = score;
	}

	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user_id", user_id);
		map.put("score", score);
		map.put("message_id", message_id);
		map.put("edit_message", edit_message);
		map.put("inline_message_id", inline_message_id);
		return map;
	}


	public boolean isEdit_message() 
	{
		return edit_message;
	}


	public void setEdit_message(boolean edit_message)
	{
		this.edit_message = edit_message;
	}

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	
	
}
