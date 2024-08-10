package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;

/**
 * This object clusters all the data need to the method send Audio 
 * (in this case the Audio will be sent by a .ogg File)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class AudioFileToSend extends AudioToSend implements FileRequest, FormDataFileContainer{

	private final File audio;
	private int index = 0;
	private final int filesToSend = 1;
	
	public AudioFileToSend(long chat_id, File audio) {
		super(chat_id);
		this.audio = audio;
	}

	public AudioFileToSend(String channelusername, File audio) {
		super(channelusername);
		this.audio = audio;
	}
	
	/**
	 * Audio file to send, it must be in an .ogg file encoded with OPUS 
	 * (other formats may be sent as Document)
	 * @return
	 */
	public File getAudio()
	{
		return audio;
	}

	@Override
	public File getFile() {
		return audio;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "audio";
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
