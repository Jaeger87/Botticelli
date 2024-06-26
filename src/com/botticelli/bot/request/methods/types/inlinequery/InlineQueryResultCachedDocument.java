package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultCachedDocument extends InlineQueryResultWithDescription{

	
	public final String type = "document";
	private String document_file_id;
	private String caption;
	
	
	public InlineQueryResultCachedDocument(String id, String title, String document_file_id) 
	{
		super(id, title);
		this.document_file_id = document_file_id;
	}


	public String getCaption() 
	{
		return caption;
	}


	public void setCaption(String caption) 
	{
		this.caption = caption;
	}


	public String getDocument_file_id() 
	{
		return document_file_id;
	}
	
	

}
