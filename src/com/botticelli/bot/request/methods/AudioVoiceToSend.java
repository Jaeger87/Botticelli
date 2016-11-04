package com.botticelli.bot.request.methods;

import java.util.Map;

/**
 * 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public abstract class AudioVoiceToSend extends AbstractCaption{

	private Integer duration;
	
	public AudioVoiceToSend(long chat_id) 
	{
		super(chat_id);

	}

	
	public AudioVoiceToSend(String channelusername) 
	{
		super(channelusername);

	}
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("duration", duration);
		return map;
	}
	
	/**
	 * Set the duration of sent audio in seconds
	 * @param duration
	 */
	public void setDuration(Integer duration)
	{
		this.duration = duration;
	}
	
	/**
	 * Duration of sent audio in seconds
	 * @return
	 */
	public Integer getDuration()
	{
		return duration;
	}
}
