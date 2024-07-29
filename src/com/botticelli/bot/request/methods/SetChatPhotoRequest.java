package com.botticelli.bot.request.methods;

import java.io.File;

public class SetChatPhotoRequest extends AbstractToSend implements FileRequest, FormDataFileContainer{

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
	public FormDataFileContainer[] getFormDataPartsContainers()
	{		
		return new FormDataFileContainer[] {this};
	}

	@Override
	public File getFile() {
		return photo;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "photo";
	}
}
