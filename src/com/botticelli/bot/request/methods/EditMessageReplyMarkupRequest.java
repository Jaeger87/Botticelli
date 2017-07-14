package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

import com.botticelli.bot.request.methods.types.InlineKeyboardMarkup;

public class EditMessageReplyMarkupRequest implements Request {

	private long chat_id;
	private String channelusername;
	private int message_id;
	private boolean wasBuiltWithMessage_id;
	private String inline_message_id;
	private InlineKeyboardMarkup reply_markup;
	
	public EditMessageReplyMarkupRequest(long chat_id, int message_id) 
	{
		this.chat_id = chat_id;
		this.message_id = message_id;
	}

	public EditMessageReplyMarkupRequest(String channelusername, int message_id) 
	{
		if(!channelusername.startsWith(AbstractToSend.at))
			channelusername = AbstractToSend.at + channelusername;
		this.channelusername = channelusername;
		this.message_id = message_id;
	}

	public EditMessageReplyMarkupRequest(String inline_message_id) 
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
		else
		    map.put("inline_message_id", inline_message_id);
		map.put("reply_markup", reply_markup);
		return map;
	}

}
