package com.botticelli.bot.request.methods.types;

/**
 * This object represents a voice note.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Voice extends TelegramFile{

	private int duration;
	
	private String mime_type;

	
	/**
	 * Duration of the audio in seconds as defined by sender
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
	 * Optional. MIME type of the file as defined by sender
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
