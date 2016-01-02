package com.botticelli.bot.request.methods.types;

public class InlineQueryResultPhoto extends InlineQueryResultWithDescription
{

	public final static String type = "photo";
	
	private String photo_url;
	
	private String mime_type;
	
	private int photo_width;
	
	private int photo_height;
	
	private String caption;
	
	public InlineQueryResultPhoto(String id)
	{
		super(id);
	}
	
	public String getPhotoUrl()
	{
		return photo_url;
	}
	
	public void setPhotoUrl(String photo_url)
	{
		this.photo_url = photo_url;
	}

	public String getMimeType()
	{
		return mime_type;
	}

	public void setMimeType(String mime_type)
	{
		this.mime_type = mime_type;
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
