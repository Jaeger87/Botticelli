package com.botticelli.bot.request.types.inlinequery;

public class InlineQueryResultArticle extends InlineQueryResultWithDescription
{

	public final String type = "article";
	
	private String url;
	
	private boolean hide_url;
	
	private String thumb_url;
	
	private int thumb_width;
	
	private int thumb_height;
	
	public InlineQueryResultArticle(String id, String title, String message_text)
	{
		super(id, title);
		setMessageText(message_text);
	}

	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	public boolean isHideUrl()
	{
		return hide_url;
	}
	
	public void setHideUrlOn()
	{
		hide_url = true;
	}
	
	public void setHideUrlOff()
	{
		hide_url = false;
	}
	
	public int getThumbWidth()
	{
		return thumb_width;
	}
	
	public void setThumbWidth(int thumb_width)
	{
		this.thumb_width = thumb_width;
	}
	
	public int getThumbHeigth()
	{
		return thumb_height;
	}
	
	public void setThumbHeigth(int thumb_height)
	{
		this.thumb_height = thumb_height;
	}


	public String getThumb_url() 
	{
		return thumb_url;
	}


	public void setThumb_url(String thumb_url) 
	{
		this.thumb_url = thumb_url;
	}
	
	
}
