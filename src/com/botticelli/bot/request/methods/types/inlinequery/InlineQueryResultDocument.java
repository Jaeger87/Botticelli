package com.botticelli.bot.request.methods.types.inlinequery;

import com.botticelli.bot.request.methods.types.DocumentMimeType;

public class InlineQueryResultDocument extends InlineQueryResultWithDescription{

	public final String type = "document";
	private String caption;
	private String document_url;
	private DocumentMimeType mime_type;
	private String thumb_url;
	private int thumb_width;
	private int thumb_height;
	
	public InlineQueryResultDocument(String id, String title, String document_url,DocumentMimeType mime_type) 
	{
		super(id, title);
		this.document_url = document_url;
		this.mime_type = mime_type;
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

	public void setThumb_url(String thumb_url) 
	{
		this.thumb_url = thumb_url;
	}

	public int getThumb_width() 
	{
		return thumb_width;
	}

	public void setThumb_width(int thumb_width) 
	{
		this.thumb_width = thumb_width;
	}

	public int getThumb_height() 
	{
		return thumb_height;
	}

	public void setThumb_height(int thumb_height) 
	{
		this.thumb_height = thumb_height;
	}

	public String getDocument_url() 
	{
		return document_url;
	}

	public DocumentMimeType getMime_type() 
	{
		return mime_type;
	}

	
}
