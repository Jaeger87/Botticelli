package com.botticelli.bot.request.methods.types;

public class ResponseParameters {

	private int migrate_to_chat_id;
	private int retry_after;
	
	
	public void setMigrate_to_chat_id(int migrate_to_chat_id)
	{
		this.migrate_to_chat_id = migrate_to_chat_id;
	}
	public void setRetry_after(int retry_after) 
	{
		this.retry_after = retry_after;
	}
	
	public int getMigrate_to_chat_id() 
	{
		return migrate_to_chat_id;
	}
	public int getRetry_after() 
	{
		return retry_after;
	}
	
	
	
}
