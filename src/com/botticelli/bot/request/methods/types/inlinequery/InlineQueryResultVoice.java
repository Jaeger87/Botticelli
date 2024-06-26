package com.botticelli.bot.request.methods.types.inlinequery;

public class InlineQueryResultVoice extends InlineQueryResult{

	public final String type = "voice"; 
	private String voice_url;
	private int voice_duration;
	
	public InlineQueryResultVoice(String id, String title, String voice_url) 
	{
		super(id, title);
		this.voice_url = voice_url;
	}

	public int getVoice_duration() 
	{
		return voice_duration;
	}

	public void setVoice_duration(int voice_duration) 
	{
		this.voice_duration = voice_duration;
	}

	public String getVoice_url() 
	{
		return voice_url;
	}

	
}
