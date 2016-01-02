package com.botticelli.bot.request.methods.types;

public class InlineQueryResultGif extends InlineQueryResult
{

	public final static String type = "gif";
	
	private String gif_url;
	
	private int gif_width;
	
	private int gif_height;
	
	private String caption;
	
	public InlineQueryResultGif(String id)
	{
		super(id);
	}

	
}
