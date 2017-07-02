package com.botticelli.bot.request.methods;

import java.util.Map;

public class RestrictChatMemberRequest extends AbstractToSend{

	private long user_id;
	private long until_date;
	private boolean can_send_messages;
	private boolean can_send_media_messages;
	private boolean can_send_other_messages;
	private boolean can_add_web_page_previews;
	
	public RestrictChatMemberRequest(long chat_id, long user_id) 
	{
		super(chat_id);
		this.user_id = user_id;
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("user_id", user_id);
		map.put("until_date", until_date);
		map.put("can_send_messages", can_send_messages);
		map.put("can_send_media_messages", can_send_media_messages);
		map.put("can_send_other_messages", can_send_other_messages);
		map.put("can_add_web_page_previews", can_add_web_page_previews);
		return map;
	}

	public long getUntil_date() 
	{
		return until_date;
	}

	public void setUntil_date(long until_date) 
	{
		this.until_date = until_date;
	}

	public boolean isCan_send_messages() 
	{
		return can_send_messages;
	}

	public void setCan_send_messages(boolean can_send_messages) 
	{
		this.can_send_messages = can_send_messages;
	}

	public boolean isCan_send_media_messages() 
	{
		return can_send_media_messages;
	}

	public void setCan_send_media_messages(boolean can_send_media_messages) 
	{
		this.can_send_media_messages = can_send_media_messages;
	}

	public boolean isCan_send_other_messages() 
	{
		return can_send_other_messages;
	}

	public void setCan_send_other_messages(boolean can_send_other_messages)
	{
		this.can_send_other_messages = can_send_other_messages;
	}

	public boolean isCan_add_web_page_previews()
	{
		return can_add_web_page_previews;
	}

	public void setCan_add_web_page_previews(boolean can_add_web_page_previews) 
	{
		this.can_add_web_page_previews = can_add_web_page_previews;
	}
	
	
	
}
