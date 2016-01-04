package com.botticelli.bot.request.methods;

import java.util.Map;

import com.botticelli.bot.request.methods.types.ActionToSend;
/**
 * This object clusters all the data need for the method sendChatAction
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ChatActionToSend extends AbstractToSend{

	private ActionToSend action;
	
	public ChatActionToSend(long chat_id, ActionToSend action) 
	{
		super(chat_id);
		this.action = action;
	}

	
	public ChatActionToSend(String channelusername, ActionToSend action) 
	{
		super(channelusername);
		this.action = action;
	}
	/**
	 * Type of action to broadcast. 
	 * Choose one, depending on what the user is about to receive: 
	 * typing for text messages, upload_photo for photos, record_video or upload_video for videos, 
	 * record_audio or upload_audio for audio files, upload_document for general files, 
	 * find_location for location data.
	 * @return
	 */
	public ActionToSend getAction()
	{
		return action;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("action", action);
		return map;
	}
	
	@Override
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
	
	
}
