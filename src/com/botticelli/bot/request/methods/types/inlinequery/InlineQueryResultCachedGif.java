package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultCachedGif extends InlineQueryResult{

	public final String type = "gif";
	private String gif_file_id;
	private String caption;
	
	public InlineQueryResultCachedGif(String id, String gif_file_id) 
	{
		super(id);
		this.gif_file_id = gif_file_id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getGif_file_id() {
		return gif_file_id;
	}
	
	
}
