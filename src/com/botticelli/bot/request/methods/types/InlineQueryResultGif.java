package com.botticelli.bot.request.methods.types;

public class InlineQueryResultGif extends InlineQueryResult
{

	public final String type = "gif";
	
	private String gif_url;
	
	private int gif_width;
	
	private int gif_height;
	
	private String caption;
	
	public InlineQueryResultGif(String id)
	{
		super(id);
	}

	public String getGifUrl()
	{
		return gif_url;
	}

	public void setGifUrl(String gif_url)
	{
		this.gif_url = gif_url;
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

	
}
