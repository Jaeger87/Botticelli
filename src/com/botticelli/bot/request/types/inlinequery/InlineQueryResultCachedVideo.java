package com.botticelli.bot.request.types.inlinequery;

public class InlineQueryResultCachedVideo extends InlineQueryResultWithDescription{

	public final String type = "video";
	private String video_file_id;
	private String caption;
	
	public InlineQueryResultCachedVideo(String id, String title, String video_file_id) 
	{
		super(id, title);
		this.video_file_id = video_file_id;
	}

	public String getCaption() 
	{
		return caption;
	}

	public void setCaption(String caption) 
	{
		this.caption = caption;
	}

	public String getVideo_file_id() 
	{
		return video_file_id;
	}

	
}
