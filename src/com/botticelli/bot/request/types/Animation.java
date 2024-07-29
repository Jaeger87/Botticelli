package com.botticelli.bot.request.types;

public class Animation {

	private String file_id;
	private PhotoSize thumb;
	private String file_name;
	private String mime_type;
	private int file_size;
	
	
	public String getFile_id() 
	{
		return file_id;
	}
	
	public void setFile_id(String file_id) 
	{
		this.file_id = file_id;
	}
	
	public PhotoSize getThumb() 
	{
		return thumb;
	}
	
	public void setThumb(PhotoSize thumb) 
	{
		this.thumb = thumb;
	}
	
	public String getFile_name() 
	{
		return file_name;
	}
	
	public void setFile_name(String file_name)
	{
		this.file_name = file_name;
	}
	
	public String getMime_type() 
	{
		return mime_type;
	}
	
	public void setMime_type(String mime_type)
	{
		this.mime_type = mime_type;
	}
	
	public int getFile_size() 
	{
		return file_size;
	}
	
	public void setFile_size(int file_size) 
	{
		this.file_size = file_size;
	}
	
	
	
	
}
