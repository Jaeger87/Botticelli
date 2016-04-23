package com.botticelli.bot.request.methods.types;

public class InlineQueryResultLocation extends InlineQueryResult{

	public final String type = "location";
	private float latitude;
	private float longitude;
	private String thumb_url;
	private String thumb_width;
	private String thumb_height;
	
	public InlineQueryResultLocation(String id, String title, float latitude, float longitude) 
	{
		super(id, title);
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getThumb_url() 
	{
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) 
	{
		this.thumb_url = thumb_url;
	}

	public String getThumb_width() 
	{
		return thumb_width;
	}

	public void setThumb_width(String thumb_width) 
	{
		this.thumb_width = thumb_width;
	}

	public String getThumb_height() 
	{
		return thumb_height;
	}

	public void setThumb_height(String thumb_height) 
	{
		this.thumb_height = thumb_height;
	}

	public float getLatitude() 
	{
		return latitude;
	}

	public float getLongitude() 
	{
		return longitude;
	}

	
	
}
