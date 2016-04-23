package com.botticelli.bot.request.methods.types;

public class InlineQueryResultAudio extends InlineQueryResult{
	

	public final String type = "audio";
	private String audio_url;
	private String performer;
	private int audio_duration;

	
	public InlineQueryResultAudio(String id,String title, String audio_url) 
	{
		super(id, title);
		this.audio_url = audio_url;
	}
	
	
	
	public String getAudio_url() {
		return audio_url;
	}



	public String getPerformer() {
		return performer;
	}


	public void setPerformer(String performer) {
		this.performer = performer;
	}


	public int getAudio_duration() {
		return audio_duration;
	}


	public void setAudio_duration(int audio_duration) {
		this.audio_duration = audio_duration;
	}
	
	
}
