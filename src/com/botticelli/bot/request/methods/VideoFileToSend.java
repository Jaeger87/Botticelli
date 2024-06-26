package com.botticelli.bot.request.methods;

import java.io.File;
/**
 * This object clusters all the data need to the method sendVideo
 * (in this case the Sticker will be send by File)
 * Telegram clients support mp4 videos (other formats may be sent as Document). 
 * Bots can currently send video files of up to 50 MB in size, this limit may be changed in the future.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class VideoFileToSend extends AbstractCaption implements FileRequest{

	private File video;
	
	public VideoFileToSend(long chat_id, File video) 
	{
		super(chat_id);
		this.video = video;
	}

	public VideoFileToSend(String channelusername, File video) 
	{
		super(channelusername);
		this.video = video;
	}
	
	/**
	 * File video
	 * @return
	 */
	public File getVideo()
	{
		return video;
	}
	
	@Override
	public File getFile() 
	{
		return video;
	}

	@Override
	public String getTypeFile() 
	{
		return "video";
	}

}
