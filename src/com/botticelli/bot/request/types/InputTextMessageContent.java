package com.botticelli.bot.request.types;

public class InputTextMessageContent implements InputMessageContent{
	
	private String message_text;
	private ParseMode parse_mode;
	private boolean disable_web_page_preview;
	
	public InputTextMessageContent(String message_text) 
	{
		this.message_text = message_text;
	}

	/**
	 * 
	 * @return
	 */
	public ParseMode getParse_mode() 
	{
		return parse_mode;
	}

	/**
	 * 
	 * @param parse_mode
	 */
	public void setParse_mode(ParseMode parse_mode) 
	{
		this.parse_mode = parse_mode;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isDisable_web_page_preview() 
	{
		return disable_web_page_preview;
	}

	/**
	 * 
	 * @param disable_web_page_preview
	 */
	public void setDisable_web_page_preview(boolean disable_web_page_preview) 
	{
		this.disable_web_page_preview = disable_web_page_preview;
	}

	/**
	 * 
	 * @return
	 */
	public String getMessage_text() 
	{
		return message_text;
	}

	/**
	 * 
	 * @param message_text
	 */
	public void setMessage_text(String message_text) 
	{
		this.message_text = message_text;
	}

	
}
