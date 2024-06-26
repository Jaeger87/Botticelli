package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultVideo extends InlineQueryResultWithDescription
{

	public final String type = "video";
	
	private String video_url;
	
	private String mime_type;
	
	private int video_width;
	
	private int video_heigth;
	
	private int video_duration;
	
	private String thumb_url;
	
	public InlineQueryResultVideo(String id, String title, String video_url, String mime_type, String thumb_url)
	{
		super(id, title);
		this.video_url = video_url;
		this.mime_type = mime_type;
		this.thumb_url = thumb_url;
	}

	public String getVideoUrl()
	{
		return video_url;
	}

	
	
	public String getThumb_url() 
	{
		return thumb_url;
	}

	public void setVideoUrl(String video_url)
	{
		this.video_url = video_url;
	}

	public String getMimeType()
	{
		return mime_type;
	}

	public void setMimeType(String mime_type)
	{
		this.mime_type = mime_type;
	}

	public int getVideoWidth()
	{
		return video_width;
	}

	public void setVideoWidth(int video_width)
	{
		this.video_width = video_width;
	}

	public int getVideoHeigth()
	{
		return video_heigth;
	}

	public void setVideoHeigth(int video_heigth)
	{
		this.video_heigth = video_heigth;
	}

	public int getVideoDuration()
	{
		return video_duration;
	}

	public void setVideoDuration(int video_duration)
	{
		this.video_duration = video_duration;
	}

}
