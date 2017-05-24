package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class SetInlineGameScoreRequest implements Request{

	private long user_id;
	private boolean force;
	private int score;
	private int message_id;
	private boolean disable_edit_message;
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
		map.put("inline_message_id", inline_message_id);
		map.put("force", force);
		map.put("disable_edit_message", disable_edit_message);
		return map;
	}


	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	
	public void setForce(boolean force) 
	{
		this.force = force;
	}


	public boolean isForce() 
	{
		return force;
	}

	public boolean isDisable_edit_message()
	{
		return disable_edit_message;
	}

	public void setDisable_edit_message(boolean disable_edit_message)
	{
		this.disable_edit_message = disable_edit_message;
	}
	
	
}
