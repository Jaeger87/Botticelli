package com.botticelli.bot.request.methods.types;

public class InlineQueryResultVideo extends InlineQueryResultWithDescription
{

	public final static String type = "video";
	
	private String video_url;
	
	private String mime_type;
	
	private int video_width;
	
	private int video_heigth;
	
	private int video_duration;
	
	public InlineQueryResultVideo(String id)
	{
		super(id);
	}

}
