package com.botticelli.bot.request.methods.types;
/**
 * This object represents a video file.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Video extends Sticker{
	
	private int duration;
	
	private String mime_type; //this is not c++ :(

	/**
	 * Duration of the video in seconds as defined by sender
	 * @return
	 */
	public int getDuration()
	{
		return duration;
	}
	
	/**
	 * Set duration of the video in seconds
	 * @param duration
	 */
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	
	/**
	 * Optional. Mime type of a file as defined by sender
	 * @return
	 */
	public String getMimeType()
	{
		return mime_type;
	}
	
	/**
	 * Optional. Set mime type of a file
	 * @param mime_type
	 */
	public void setMimeType(String mime_type)
	{
		this.mime_type = mime_type;
	}
}
