package com.botticelli.bot.request.methods;

import java.util.Map;

public class SetGameScoreRequest extends GetGameHighScoresRequest{


	private int score;
	private boolean edit_message;
	
	
	public SetGameScoreRequest(String channelusername, long user_id, int score, int message_id)
	{
		super(channelusername, user_id, message_id);
		this.score = score;
	}
	
	
	public SetGameScoreRequest(long chat_id, long user_id, int score, int message_id)
	{
		super(chat_id, user_id, message_id);
		this.score = score;
	}

	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("score", score);
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
