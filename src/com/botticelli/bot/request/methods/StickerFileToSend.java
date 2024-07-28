package com.botticelli.bot.request.methods;

import java.io.File;
/**
 * This object clusters all the data need to the method sendSticker
 * (in this case the Sticker will be send by .webp File)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class StickerFileToSend extends AbstractReplyManageToSend implements FileRequest{

	private File sticker;
	
	public StickerFileToSend(long chat_id, File sticker) 
	{
		super(chat_id);
		this.sticker = sticker;
	}

	public StickerFileToSend(String channelusername, File sticker) 
	{
		super(channelusername);
		this.sticker = sticker;
	}
	
	/**
	 * Sticker file
	 * @return
	 */
	public File getSticker()
	{
		return sticker;
	}
	
	@Override
	public File getFile() 
	{
		return sticker;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "sticker";
	}

}
