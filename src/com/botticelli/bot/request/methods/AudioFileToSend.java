package com.botticelli.bot.request.methods;

import java.io.File;
/**
 * This object clusters all the data need to the method send Audio 
 * (in this case the Audio will be send by a .ogg File)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class AudioFileToSend extends AudioToSend implements FileRequest{

	private File audio;
	
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
	public File getFormDataPartsContainers()
	{
		return audio;
	}



	@Override
	public String getFormDataParameterName()
	{
		return "audio";
	}

}
