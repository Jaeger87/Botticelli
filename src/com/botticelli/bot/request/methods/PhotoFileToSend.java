package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;

/**
 * This object clusters all the data need to the method sendPhoto
 * (in this case the Photo will be sent by File (jpg, png ecc...))
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class PhotoFileToSend extends PhotoToSend implements FileRequest, FormDataFileContainer{

	private final File photo;
	private int index = 0;
	private final int filesToSend = 1;

	public PhotoFileToSend(long chat_id, File photo) 
	{
		super(chat_id);
		this.photo = photo;
	}

	
	public PhotoFileToSend(String channelusername, File photo) 
	{
		super(channelusername);
		this.photo = photo;
	}
	/**
	 * Photo file
	 * @return
	 */
	public File getPhoto()
	{
		return photo;
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
