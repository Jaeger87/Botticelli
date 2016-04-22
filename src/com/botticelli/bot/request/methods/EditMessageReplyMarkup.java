package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

import com.botticelli.bot.request.methods.types.InlineKeyboardMarkup;
import com.google.gson.Gson;

public class EditMessageReplyMarkup implements Request {

	private long chat_id;
	private String channelusername;
	private int message_id;
	private boolean wasBuiltWithMessage_id;
	private String inline_message_id;
	private InlineKeyboardMarkup reply_markup;

	public EditMessageReplyMarkup(long chat_id, int message_id) 
	{
		this.chat_id = chat_id;
		this.message_id = message_id;
	}

	public EditMessageReplyMarkup(String channelusername, int message_id) 
	{
		this.channelusername = channelusername;
		this.message_id = message_id;
	}

	public EditMessageReplyMarkup(String inline_message_id) 
	{
		this.inline_message_id = inline_message_id;
		wasBuiltWithMessage_id = true;
	}

	public InlineKeyboardMarkup getReply_markup() 
	{
		return reply_markup;
	}

	public void setReply_markup(InlineKeyboardMarkup reply_markup) 
	{
		this.reply_markup = reply_markup;
	}

	@Override
	public Map<String, Object> getValuesMap() {
		Map<String, Object> map = new HashMap<String, Object>();

		if (!wasBuiltWithMessage_id)	
		{
			map.put("message_id", message_id);

			if (channelusername != null)
				map.put("chat_id", channelusername);
			else
				map.put("chat_id", new Long(chat_id));
		}
		map.put("inline_message_id", inline_message_id);
		Gson gson = new Gson();
		map.put("reply_markup", gson.toJson(reply_markup));
		return map;
	}

}
