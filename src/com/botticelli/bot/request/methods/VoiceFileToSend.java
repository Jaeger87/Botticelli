package com.botticelli.bot.request.methods;

import java.io.File;
/**
 * 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class VoiceFileToSend extends AudioVoiceToSend implements FileRequest
{

	private File voice;
	
	public VoiceFileToSend(long chat_id, File voice) 
	{
		super(chat_id);
		this.voice = voice;

	}

	public VoiceFileToSend(String channelusername, File voice) 
	{
		super(channelusername);
		this.voice = voice;
	}
	
	@Override
	public File getFile() 
	{		
		return voice;
	}

	@Override
	public String getTypeFile() 
	{
		return "voice";
	}

}
