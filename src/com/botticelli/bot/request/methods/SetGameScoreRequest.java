package com.botticelli.bot.request.methods;

import java.util.Map;

public class SetGameScoreRequest extends AbstractToSend{


	private long user_id;
	private int score;
	private int message_id;
	private boolean edit_message;
	private String inline_message_id;
	
	
	public SetGameScoreRequest(String channelusername, long user_id, int score, int message_id)
	{
		super(channelusername);
		this.user_id = user_id;
		this.score = score;
		this.message_id = message_id;
	}
	
	
	public SetGameScoreRequest(long chat_id, long user_id, int score, int message_id)
	{
		super(chat_id);
		this.user_id = user_id;
		this.score = score;
		this.message_id = message_id;
	}

	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("user_id", user_id);
		map.put("score", score);
		map.put("message_id", message_id);
		map.put("edit_message", edit_message);
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
	
	

}
