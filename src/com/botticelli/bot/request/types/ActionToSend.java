package com.botticelli.bot.request.types;

/**
 * Type of action to broadcast
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public enum ActionToSend
{
	TYPING("typing"),UPLOADPHOTO("upload_photo"),RECORDVIDEO("record_video"),UPLOADVIDEO("upload_video"),RECORDAUDIO("record_audio"),UPLOADAUDIO("upload_audio"),
	UPLOADDOCUMENT("upload_document"), FINDLOCATION("find_location"), RECORDVIDEONOTE("record_video_note"), UPLOADVIDEONOTE("upload_video_note");
	private String str;
	/**
	 * Builder
	 * @param str
	 */
	ActionToSend(String str)
	{
		this.str=str;
	}
	/**
	 * Returns the appropriate string
	 */
	public String toString()
	{
		return str;
	}
}
