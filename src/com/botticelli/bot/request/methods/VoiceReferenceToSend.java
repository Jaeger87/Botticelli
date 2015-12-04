package com.botticelli.bot.request.methods;

import java.util.Map;

/**
 * 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class VoiceReferenceToSend extends AudioVoiceToSend{

	private String voice;
	
	public VoiceReferenceToSend(int chat_id, String voice) 
	{
		super(chat_id);
		this.voice = voice;
	}
	
	public VoiceReferenceToSend(String channelusername, String voice) 
	{
		super(channelusername);
		this.voice = voice;
	}
	
	public String getVoice()
	{
		return voice;
	}
	

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("voice", voice);
		return map;
	}
}
