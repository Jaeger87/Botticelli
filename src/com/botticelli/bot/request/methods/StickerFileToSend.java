package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;

/**
 * This object clusters all the data need to the method sendSticker
 * (in this case the Sticker will be send by .webp File)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class StickerFileToSend extends AbstractReplyManageToSend implements FileRequest, FormDataFileContainer{

	private File sticker;
	private int index = 0;
	private final int filesToSend = 1;
	
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
	public File getFile() {
		return sticker;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "sticker";
	}

	@Override
	public Iterator<FormDataFileContainer> iterator() {
		index = 0;
		return this;
	}

	@Override
	public boolean hasNext() {
		return index < filesToSend;
	}

	@Override
	public FormDataFileContainer next() {
		if(index == 0)
			return this;
		return null;
	}
}
