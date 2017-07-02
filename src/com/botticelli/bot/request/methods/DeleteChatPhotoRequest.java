package com.botticelli.bot.request.methods;

public class DeleteChatPhotoRequest extends AbstractToSend {

	public DeleteChatPhotoRequest(long chat_id) 
	{
		super(chat_id);
	}
	
	public DeleteChatPhotoRequest(String channelusername) 
	{
		super(channelusername);
	}

}
