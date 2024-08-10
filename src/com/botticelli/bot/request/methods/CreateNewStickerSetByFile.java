package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;

public class CreateNewStickerSetByFile extends AbstractCreateNewStickerSet implements FileRequest, FormDataFileContainer{

	private final File png_sticker;
	private int index = 0;
	private final int filesToSend = 1;
	
	public CreateNewStickerSetByFile(long user_id, String name, String title, String emojis, File png_sticker) {
		super(user_id, name, title, emojis);
		this.png_sticker = png_sticker;
	}

	@Override
	public File getFile() {
		return png_sticker;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "png_sticker";
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
