package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultGif extends InlineQueryResult
{

	public final String type = "gif";
	
	private String gif_url;
	
	private int gif_width;
	
	private int gif_height;
	
	private String caption;
	
	private String thumb_url;
	
	private int gif_duration;
	
	public InlineQueryResultGif(String id, String gif_url, String thumb_url)
	{
		super(id);
		this.gif_url = gif_url;
		this.thumb_url = thumb_url;
	}

	public String getGifUrl()
	{
		return gif_url;
	}

	public int getGifWidth()
	{
		return gif_width;
	}

	public void setGifWidth(int gif_width)
	{
		this.gif_width = gif_width;
	}

	public int getGifHeight()
	{
		return gif_height;
	}

	public void setGifHeight(int gif_height)
	{
		this.gif_height = gif_height;
	}

	public String getCaption()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		this.caption = caption;
	}

	public String getThumb_url() 
	{
		return thumb_url;
	}

	public int getGifDuration() 
	{
		return gif_duration;
	}

	public void setGifDuration(int gif_duration) 
	{
		this.gif_duration = gif_duration;
	}

	
}
