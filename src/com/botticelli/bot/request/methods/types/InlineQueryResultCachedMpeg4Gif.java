package com.botticelli.bot.request.methods.types;

public class InlineQueryResultCachedMpeg4Gif extends InlineQueryResult{

	public final String type = "mpeg4_gif";
	private String mpeg4_file_id;
	private String caption;
	
	public InlineQueryResultCachedMpeg4Gif(String id, String mpeg4_file_id) 
	{
		super(id);
		this.mpeg4_file_id = mpeg4_file_id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getMpeg4_file_id() {
		return mpeg4_file_id;
	}

	
}
