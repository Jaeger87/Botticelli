package com.botticelli.bot.request.methods.types;

public class InlineKeyboardButton {

	private String text;
	private String url;
	private String callback_data;
	private String switch_inline_query;
	
	public InlineKeyboardButton(String text, String url) 
	{
		this.text = text;
		this.url = url;
	}

	
	
}
