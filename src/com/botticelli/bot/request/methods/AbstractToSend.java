package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;
/**
 * Represent a common request for a send method.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public abstract class AbstractToSend implements Request{

	private long chat_id;
	private String channelusername;
	
	public AbstractToSend(int chat_id)
	{
		this.chat_id = chat_id;
	}
	
	public AbstractToSend(String channelusername)
	{
		this.channelusername = channelusername;
	}
	
	/**
	 * Unique identifier for the message recipient — User or GroupChat id
	 * @return
	 */
	public long getChatID()
	{
		return chat_id;
	}
	
	public String getChannelID()
	{
		return channelusername;
	}

	public Map<String, Object> getValuesMap()
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		if(channelusername != null)
			map.put("chat_id", channelusername);
		else
		    map.put("chat_id", new Long(chat_id));
		return map;
	}
}
