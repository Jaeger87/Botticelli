package com.botticelli.bot.request.methods.types;

public class InlineKeyboardButton {

	private String text;
	private String url;
	private String callback_data;
	private String switch_inline_query;
	private String switch_inline_query_current_chat;
	private CallbackGame callback_game;
	private boolean pay;
	
	public InlineKeyboardButton(String text) 
	{
		this.text = text;
	}

	public String getText() 
	{
		return text;
	}

	public String getUrl() 
	{
		return url;
	}

	public void setUrl(String url) 
	{
		nullAll();
		this.url = url;
	}

	public String getCallback_data() 
	{
		return callback_data;
	}

	public void setCallback_data(String callback_data) 
	{
		nullAll();
		this.callback_data = callback_data;
	}

	public String getSwitch_inline_query() 
	{
		return switch_inline_query;
	}

	public void setSwitch_inline_query(String switch_inline_query) 
	{
		nullAll();
		this.switch_inline_query = switch_inline_query;
	}

	private void nullAll()
	{
		url = null;
		callback_data = null;
		switch_inline_query = null;
	}
	
	public static InlineKeyboardButton inlineKeyboardButtonBuilderURL(String text, String url)
	{
		InlineKeyboardButton ikb = new InlineKeyboardButton(text);
		ikb.url = url;
		return ikb;
	}
	
	public static InlineKeyboardButton inlineKeyboardButtonBuilderCallback(String text, String callback_data)
	{
		InlineKeyboardButton ikb = new InlineKeyboardButton(text);
		ikb.callback_data = callback_data;
		return ikb;
	}
	
	public static InlineKeyboardButton inlineKeyboardButtonBuilderSwitch(String text, String switch_inline_query)
	{
		InlineKeyboardButton ikb = new InlineKeyboardButton(text);
		ikb.switch_inline_query = switch_inline_query;
		return ikb;
	}

	public CallbackGame getCallback_game() 
	{
		return callback_game;
	}

	public void setCallback_game(CallbackGame callback_game) 
	{
		this.callback_game = callback_game;
	}

	public String getSwitch_inline_query_current_chat()
	{
		return switch_inline_query_current_chat;
	}

	public void setSwitch_inline_query_current_chat(String switch_inline_query_current_chat) 
	{
		this.switch_inline_query_current_chat = switch_inline_query_current_chat;
	}

	public boolean isPay() 
	{
		return pay;
	}

	public void setPay(boolean pay) 
	{
		this.pay = pay;
	}
	
	
	
	
}
