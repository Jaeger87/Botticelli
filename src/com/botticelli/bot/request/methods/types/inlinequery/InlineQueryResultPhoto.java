package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultPhoto extends InlineQueryResultWithDescription
{

	public final String type = "photo";
	
	private String photo_url;
	
	private int photo_width;
	
	private int photo_height;
	
	private String caption;
	
	private String thumb_url;
	
	public InlineQueryResultPhoto(String id, String photo_url, String thumb_url)
	{
		super(id);
		this.photo_url = photo_url;
		this.thumb_url = thumb_url;
	}
	
	public String getPhotoUrl()
	{
		return photo_url;
	}
	
	public String getThumb_url() 
	{
		return thumb_url;
	}

	public int getPhotoWidth()
	{
		return photo_width;
	}

	public void setPhotoWidth(int photo_width)
	{
		this.photo_width = photo_width;
	}

	public int getPhotoHeight()
	{
		return photo_height;
	}

	public void setPhotoHeight(int photo_height)
	{
		this.photo_height = photo_height;
	}

	public String getCaption()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		this.caption = caption;
	}

}
