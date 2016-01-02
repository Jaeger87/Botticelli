package com.botticelli.bot.request.methods.types;

public class InlineQueryResultPhoto extends InlineQueryResultWithDescription
{

	public final static String type = "photo";
	
	private String photo_url;
	
	private String mime_type;
	
	private int photo_width;
	
	private int photo_height;
	
	private String caption;
	
	public InlineQueryResultPhoto(String id)
	{
		super(id);
	}
	
	

}
