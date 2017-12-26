package com.botticelli.bot.request.methods;

public class LiveLocationToStop extends EditMessageReplyMarkupRequest{

	
	public LiveLocationToStop(long chat_id, int message_id) 
	{
		super(chat_id, message_id);
	}
	
	public LiveLocationToStop(String inline_message_id) 
	{
		super(inline_message_id);
	}



}
