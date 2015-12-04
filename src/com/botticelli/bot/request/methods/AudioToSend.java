package com.botticelli.bot.request.methods;

import java.util.Map;

public abstract class AudioToSend extends AudioVoiceToSend{

	
	private String performer;
	private String title;
	
	public AudioToSend(int chat_id) 
	{
		super(chat_id);
	}
	
	public AudioToSend(String channelusername) 
	{
		super(channelusername);
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("performer", performer);
		map.put("title", title);
		return map;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPerformer()
	{
		return performer;
	}

	/**
	 * 
	 * @param performer
	 */
	public void setPerformer(String performer)
	{
		this.performer = performer;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

}
