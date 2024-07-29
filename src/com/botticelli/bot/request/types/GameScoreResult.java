package com.botticelli.bot.request.types;

public class GameScoreResult {

	private Message message;
	private boolean ok;
	
	
	public Message getMessage() 
	{
		return message;
	}
	public void setMessage(Message message) 
	{
		this.message = message;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) 
	{
		this.ok = ok;
	}
	
	
	
}
