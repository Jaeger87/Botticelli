package com.botticelli.bot.request.methods.types;

public class InlineQueryResultMpeg4Gif extends InlineQueryResult
{

	public final static String type = "mpeg4_gif";
	
	private String mpeg4_url;
	
	private int mpeg4_width;
	
	private int mpeg4_height;
	
	private String caption;
	
	public InlineQueryResultMpeg4Gif(String id)
	{
		super(id);
	}

	public String getMpeg4Url()
	{
		return mpeg4_url;
	}

	public void setMpeg4Url(String mpeg4_url)
	{
		this.mpeg4_url = mpeg4_url;
	}

	public int getMpeg4Width()
	{
		return mpeg4_width;
	}

	public void setMpeg4Width(int mpeg4_width)
	{
		this.mpeg4_width = mpeg4_width;
	}

	public int getMpeg4Height()
	{
		return mpeg4_height;
	}

	public void setMpeg4Height(int mpeg4_height)
	{
		this.mpeg4_height = mpeg4_height;
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
