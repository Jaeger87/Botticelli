package com.botticelli.bot.request.methods.types;

public abstract class InlineQueryResult
{
	private String id;
	
	private String title;
	
	private String message_text;
	
	private String parse_mode;
	
	private boolean disable_web_page_preview;
	
	private String thumb_url;
	
	public InlineQueryResult(String id)
	{
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getMessageText()
	{
		return message_text;
	}
	
	public void setMessageText(String message_text)
	{
		this.message_text = message_text;
	}

	public void setParseModeOn()
	{
		parse_mode = "Markdown";
	}
	
	public void setParseModeOff()
	{
		parse_mode = null;
	}
	
	public boolean isInParseMode()
	{
		return parse_mode.equals("Markdown");
	}
	
	public boolean getDisableWebPagePreview()
	{
		return disable_web_page_preview;
	}
	
	public void setDisableWebPagePreview(boolean disable_web_page_preview)
	{
		this.disable_web_page_preview = disable_web_page_preview;
	}
	
	public String getThumbUrl()
	{
		return thumb_url;
	}
	
	public void setThumbUrl(String thumb_url)
	{
		this.thumb_url = thumb_url;;
	}
	
}
