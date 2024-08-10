package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;

/**
 * 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class VoiceFileToSend extends AudioVoiceToSend implements FileRequest, FormDataFileContainer
{

	private File voice;
	private int index = 0;
	private final int filesToSend = 1;
	
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
	public File getFile() {
		return voice;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "voice";
	}

	@Override
	public Iterator<FormDataFileContainer> iterator() {
		index = 0;
		return this;
	}

	@Override
	public boolean hasNext() {
		return index < filesToSend;
	}

	@Override
	public FormDataFileContainer next() {
		if(index == 0)
			return this;
		return null;
	}

}
