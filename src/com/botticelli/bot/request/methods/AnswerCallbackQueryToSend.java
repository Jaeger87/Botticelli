package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class AnswerCallbackQueryToSend implements Request{

	private String callback_query_id;
	private String text;
	private boolean show_alert;
	
	
	public AnswerCallbackQueryToSend(String callback_query_id) 
	{
		this.callback_query_id = callback_query_id;
	}

	/**
	 * 
	 * @return
	 */
	public String getText() 
	{
		return text;
	}


	/**
	 * 
	 * @param text
	 */
	public void setText(String text) 
	{
		this.text = text;
	}


	/**
	 * 
	 * @return
	 */
	public boolean isShow_alert() 
	{
		return show_alert;
	}



	public void setShow_alert(boolean show_alert) 
	{
		this.show_alert = show_alert;
	}



	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map <String, Object> map = new HashMap<>();;
		map.put("callback_query_id", callback_query_id);
		map.put("text", text);
		map.put("show_alert", show_alert);
		return map;
	}
	
	
}
