package com.botticelli.bot.request.types;

/**
 * This object represents a general file (as opposed to photos and audio files).
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Document extends TelegramFile{
	
	private PhotoSize thumb;
	
	private String file_name;
	
	private String mime_type;  //maybe i should create another abstract class for this class and Audio

	/**
	 * Optional. Document thumbnail as defined by sender
	 * @return
	 */
	public PhotoSize getThumb()
	{
		return thumb;
	}
	
	/**
	 * Optional. Set the document thumbnail as defined by sender
	 * @param thumb
	 */
	public void  setThumb(PhotoSize thumb)
	{
		this.thumb = thumb;
	}
	
	/**
	 * Optional. Original filename as defined by sender
	 * @return
	 */
	public String getFileName()
	{
		return file_name;
	}
	
	/**
	 * Optional. Set the original filename as defined by sender
	 * @param file_name
	 */
	public void setFileName(String file_name)
	{
		this.file_name = file_name;
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
	 * Optional. Set the MIME type of the file as defined by sender
	 * @param mime_type
	 */
	public void setMimeType(String mime_type)
	{
		this.mime_type = mime_type;
	}
}
