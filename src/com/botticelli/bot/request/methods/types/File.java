package com.botticelli.bot.request.methods.types;

public class File extends TelegramFile{

	private String file_path;
	
	public String getFilePath()
	{
		return file_path;
	}
	
	public void setFilePath(String file_path)
	{
		this.file_path = file_path;
	}
}
