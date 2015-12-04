package com.botticelli.bot.request.methods.types;
/**
 * This object represent a generic file.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public abstract class TelegramFile {

	private String file_id;
	
	private int file_size;
	
	/**
	 * Unique identifier for this file
	 * @return
	 */
	public String getFileID()
	{
		return file_id;
	}
	
	/**
	 * Set the unique identifier for this file
	 * @param file_id
	 */
	public void setFileID(String file_id)
	{
		this.file_id = file_id;
	}
	
	
	/**
	 * Optional. File size
	 * @return
	 */
	public int getfileSize()
	{
		return file_size;
	}
	
	/**
	 * Optional. Set file size
	 * @param file_size
	 */
	public void setFileSize(int file_size)
	{
		this.file_size = file_size;
	}
}
