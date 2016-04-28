package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

import com.botticelli.bot.request.methods.types.ParseMode;

public class EditMessageTextRequest extends EditMessageReplyMarkupRequest{

	

	private String text;
	private ParseMode parse_mode;
	private boolean disable_web_page_preview;
	
	public EditMessageTextRequest(long chat_id, int message_id, String text) 
	{
		super(chat_id, message_id);
		this.text = text;
	}
	
	


	public EditMessageTextRequest(String channelusername, int message_id, String text) 
	{
		super(channelusername, message_id);
		this.text = text;
	}
	
	
	public EditMessageTextRequest(String inline_message_id, String text) 
	{
		super(inline_message_id);
		this.text = text;
	}

	public ParseMode getParse_mode() 
	{
		return parse_mode;
	}

	public void setParse_mode(ParseMode parse_mode) 
	{
		this.parse_mode = parse_mode;
	}

	public boolean isDisable_web_page_preview() 
	{
		return disable_web_page_preview;
	}


	public void setDisable_web_page_preview(boolean disable_web_page_preview) 
	{
		this.disable_web_page_preview = disable_web_page_preview;
	}


	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map <String, Object> map = super.getValuesMap();
		
		map.put("text", text);
		map.put("parse_mode", parse_mode);
		map.put("disable_web_page_preview", disable_web_page_preview);
		
		return map;
	}

}
