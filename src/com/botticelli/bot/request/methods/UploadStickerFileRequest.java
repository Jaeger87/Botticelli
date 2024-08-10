package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UploadStickerFileRequest implements FileRequest, FormDataFileContainer{

	private long user_id;
	private File png_sticker;
	private int index = 0;
	private final int filesToSend = 1;

	
	public UploadStickerFileRequest(long user_id, File png_sticker) 
	{
		this.user_id = user_id;
		this.png_sticker = png_sticker;
	}

	@Override
	public Map<String, Object> getValuesMap() 
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("user_id", user_id);
		return map;
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
