package com.botticelli.bot.request.methods.types;

public class InlineQueryResultMpeg4Gif extends InlineQueryResult
{

	public final static String type = "mpeg4_gif";
	
	private String mpeg4_url;
	
	private int mpeg4_width;
	
	private int mpeg4_height;
	
	private String caption;
	
	public InlineQueryResultMpeg4Gif(String id)
	{
		super(id);
	}
	
	

}
