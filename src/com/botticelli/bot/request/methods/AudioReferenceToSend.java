package com.botticelli.bot.request.methods;

import java.util.Map;
/**
 * This object clusters all the data need for the method send Audio 
 * (in this case the Audio will be send by file_id)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class AudioReferenceToSend extends AudioToSend
{
	private String audio;
	
	public AudioReferenceToSend(long chat_id, String audio) 
	{
		super(chat_id);
		this.audio = audio;
	}

	public AudioReferenceToSend(String channelusername, String audio) {
		super(channelusername);
		this.audio = audio;
	}
	/**
	 * Audio file_id to send.
	 * @return
	 */
	public String getAudio()
	{
		return audio;
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("audio", audio);
		return map;
	}
	/**
	 * 
	 */
	public String toString()
	{
		
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}


}
