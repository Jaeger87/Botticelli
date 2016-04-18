package com.botticelli.bot.request.methods.types;

public class InlineQueryResultArticle extends InlineQueryResultWithDescription
{

	public final String type = "article";
	
	private String url;
	
	private boolean hide_url;
	
	private int thumb_width;
	
	private int thumb_height;
	
	public InlineQueryResultArticle(String id, String title, String message_text)
	{
		super(id);
		setTitle(title);
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
}
