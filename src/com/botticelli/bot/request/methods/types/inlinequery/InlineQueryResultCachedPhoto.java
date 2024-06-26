package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultCachedPhoto extends InlineQueryResultWithDescription{


	public final String type = "photo";
	
	private String photo_file_id;
	
	private String caption;
	
	public InlineQueryResultCachedPhoto(String id, String photo_file_id) 
	{
		super(id);
		this.photo_file_id = photo_file_id;
	}

	public String getCaption() 
	{
		return caption;
	}

	public void setCaption(String caption) 
	{
		this.caption = caption;
	}

	public String getPhoto_file_id() 
	{
		return photo_file_id;
	}

	
}
