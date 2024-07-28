package com.botticelli.bot.request.methods;

import java.io.File;

public class SetChatPhotoRequest extends AbstractToSend implements FileRequest{

	private File photo; 
	
	public SetChatPhotoRequest(long chat_id, File photo) 
	{
		super(chat_id);
		this.photo = photo;
	}

	public SetChatPhotoRequest(String channelusername, File photo) 
	{
		super(channelusername);
		this.photo = photo;
	}

	@Override
	public File getFile() 
	{		
		return photo;
	}

	@Override
	public String getParameterName()
	{
		return "photo";
	}
}
