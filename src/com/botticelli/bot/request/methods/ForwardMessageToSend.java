package com.botticelli.bot.request.methods;

import java.util.Map;
/**
 * This object clusters all the data need for the method forwardMessage
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ForwardMessageToSend extends AbstractToSend{

	private int from_chat_id;
	
	private int message_id;
	
	public ForwardMessageToSend(long chat_id, int from_chat_id, int message_id) 
	{
		super(chat_id);
		this.from_chat_id = from_chat_id;
		this.message_id = message_id;
	}

	
	public ForwardMessageToSend(String channelusername, int from_chat_id, int message_id) 
	{
		super(channelusername);
		this.from_chat_id = from_chat_id;
		this.message_id = message_id;
	}
	/**
	 * Unique identifier for the chat where the original message was sent — User or GroupChat id
	 * @return
	 */
	public int getFromChatID()
	{
		return from_chat_id;
	}
	
	/**
	 * Unique message identifier
	 * @return
	 */
	public int getMessageID()
	{
		return message_id;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("from_chat_id", new Integer(from_chat_id));
		map.put("message_id", new Integer(message_id));
		return map;
	}
	
	@Override
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
}
