package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultCachedVoice extends InlineQueryResult{

	public final String type = "voice"; 
	private String voice_file_id;
	
	public InlineQueryResultCachedVoice(String id, String title, String voice_file_id) 
	{
		super(id, title);
		this.voice_file_id = voice_file_id;
	}

	public String getVoice_file_id() 
	{
		return voice_file_id;
	}

	
}
