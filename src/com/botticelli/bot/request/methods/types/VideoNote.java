package com.botticelli.bot.request.methods.types;

public class VideoNote extends TelegramFile{
	
	private int duration;
	
	private int length;
	
	private PhotoSize thumb;

	public int getDuration() 
	{
		return duration;
	}

	public void setDuration(int duration) 
	{
		this.duration = duration;
	}

	public int getLength() 
	{
		return length;
	}

	public void setLength(int length) 
	{
		this.length = length;
	}

	public PhotoSize getThumb() 
	{
		return thumb;
	}

	public void setThumb(PhotoSize thumb)
	{
		this.thumb = thumb;
	}
	
	

}
