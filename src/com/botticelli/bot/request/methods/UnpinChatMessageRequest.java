package com.botticelli.bot.request.methods;

public class UnpinChatMessageRequest extends AbstractToSend{

	public UnpinChatMessageRequest(long chat_id) 
	{
		super(chat_id);
	}
	
	public UnpinChatMessageRequest(String channelusername) 
	{
		super(channelusername);
	}

}
