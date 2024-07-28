package com.botticelli.bot.request.methods;

import java.io.File;

public class CreateNewStickerSetByFile extends AbstractCreateNewStickerSet implements FileRequest{

	private File png_sticker;
	
	public CreateNewStickerSetByFile(long user_id, String name, String title, String emojis, File png_sticker) {
		super(user_id, name, title, emojis);
		this.png_sticker = png_sticker;
	}

	@Override
	public File getFile() 
	{
		return png_sticker;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "png_sticker";
	}

}
