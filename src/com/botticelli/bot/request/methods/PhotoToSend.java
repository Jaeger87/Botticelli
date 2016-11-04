package com.botticelli.bot.request.methods;

public abstract class PhotoToSend extends AbstractCaption{

	
	public PhotoToSend(long chat_id) 
	{
		super(chat_id);
	}

	public PhotoToSend(String channelusername) 
	{
		super(channelusername);
	}
	
}
