package com.botticelli.bot.request.methods;

import java.io.File;

/**
 * This object clusters all the data need to the method sendPhoto
 * (in this case the Photo will be send by File (jpg, png ecc...))
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class PhotoFileToSend extends PhotoToSend implements FileRequest{

	private File photo;
	
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
	public File getFile() 
	{
		return photo;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "photo";
	}

}
