package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;

public class SetChatPhotoRequest extends AbstractToSend implements FileRequest, FormDataFileContainer{

	private File photo;
	private int index = 0;
	private final int filesToSend = 1;
	
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
	public File getFile() {
		return photo;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "photo";
	}

	@Override
	public Iterator<FormDataFileContainer> iterator() {
		index = 0;
		return this;
	}

	@Override
	public boolean hasNext() {
		return index < filesToSend;
	}

	@Override
	public FormDataFileContainer next() {
		if(index == 0)
			return this;
		return null;
	}
}
