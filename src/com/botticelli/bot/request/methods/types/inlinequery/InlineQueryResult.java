package com.botticelli.bot.request.methods.types.inlinequery;

import com.botticelli.bot.request.methods.types.InlineKeyboardMarkup;
import com.botticelli.bot.request.methods.types.InputMessageContent;

public abstract class InlineQueryResult
{
	private String id;
	
	private String title;
	
	private String message_text;
	
	private String parse_mode;
	
	private boolean disable_web_page_preview;
	

	
	private InputMessageContent input_message_content;
	
	private InlineKeyboardMarkup reply_markup;
	
	public InlineQueryResult(String id)
	{
		this.id = id;
	}
	
	public InlineQueryResult(String id, String title)
	{
		this.id = id;
		this.title = title;
	}
	
	
	public String getId()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getMessageText()
	{
		return message_text;
	}
	
	public void setMessageText(String message_text)
	{
		this.message_text = message_text;
	}

	public void setParseModeOn()
	{
		parse_mode = "Markdown";
	}
	
	public void setParseModeOff()
	{
		parse_mode = null;
	}
	
	public boolean isInParseMode()
	{
		return parse_mode.equals("Markdown");
	}
	
	public boolean getDisableWebPagePreview()
	{
		return disable_web_page_preview;
	}
	
	public void setDisableWebPagePreview(boolean disable_web_page_preview)
	{
		this.disable_web_page_preview = disable_web_page_preview;
	}

	public InputMessageContent getInput_message_content() 
	{
		return input_message_content;
	}

	/**
	 * 
	 * @param input_message_content
	 */
	public void setInput_message_content(InputMessageContent input_message_content) 
	{
		this.input_message_content = input_message_content;
	}

	public InlineKeyboardMarkup getReply_markup() {
		return reply_markup;
	}

	public void setReply_markup(InlineKeyboardMarkup reply_markup) {
		this.reply_markup = reply_markup;
	}
	
	
	
}
