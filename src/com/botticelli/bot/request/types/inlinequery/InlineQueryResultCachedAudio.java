package com.botticelli.bot.request.types.inlinequery;

public class InlineQueryResultCachedAudio extends InlineQueryResult{

	public final String type = "audio";
	private String audio_file_id;
	
	public InlineQueryResultCachedAudio(String id, String audio_file_id) {
		super(id);
		this.audio_file_id = audio_file_id;
	}

	public String getAudio_file_id() 
	{
		return audio_file_id;
	}

	@Override
	public void setTitle(String title)
	{
		
	}
}
