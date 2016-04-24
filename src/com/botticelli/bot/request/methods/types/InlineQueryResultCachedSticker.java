package com.botticelli.bot.request.methods.types;

public class InlineQueryResultCachedSticker extends InlineQueryResult{

	public final String type = "sticker"; 
	private String sticker_file_id;
	
	
	public InlineQueryResultCachedSticker(String id, String sticker_file_id) {
		super(id);
		this.sticker_file_id = sticker_file_id;
	}
	
	@Override
	public void setTitle(String title)
	{
		
	}

	public String getSticker_file_id() 
	{
		return sticker_file_id;
	}

	
	
}
