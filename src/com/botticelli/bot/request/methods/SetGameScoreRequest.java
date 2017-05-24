package com.botticelli.bot.request.methods;

import java.util.Map;

public class SetGameScoreRequest extends GetGameHighScoresRequest{

	private boolean force;
	private int score;
	private boolean disable_edit_message;
	
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
		map.put("force", force);
		map.put("disable_edit_message", disable_edit_message);
		return map;
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
