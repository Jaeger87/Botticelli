package com.botticelli.bot.request.methods.types;

public abstract class AbstractReplyKeyboardMarkup extends ReplyKeyboard{

	private boolean resize_keyboard;

	private boolean one_time_keyboard;
	
	
	public AbstractReplyKeyboardMarkup()
	{
		
	}
	
	public AbstractReplyKeyboardMarkup( boolean resize_keyboard, 
			boolean one_time_keyboard, boolean selective) 
	{
		super(selective);
		this.one_time_keyboard = one_time_keyboard;
		this.resize_keyboard = resize_keyboard;
	}

	/**
	 * Optional. Requests clients to resize the keyboard vertically for optimal fit 
	 * (e.g., make the keyboard smaller if there are just two rows of buttons). 
	 * Defaults to false, in which case the custom keyboard is always of the same height as the app's standard keyboard.
	 * @return
	 */
	public boolean getResizeKeyboard()
	{
		return resize_keyboard;
	}
	
	/**
	 * Optional. Set the requests clients to resize the keyboard vertically for optimal fit 
	 * @param resize_keyboard
	 */
	public void setResizeKeyboard(boolean resize_keyboard)
	{
		this.resize_keyboard = resize_keyboard;
	}
	/**
	 * Optional. Requests clients to hide the keyboard as soon as it's been used. Defaults to false.
	 * @return
	 */
	public boolean getOneTimeKeyboard()
	{
		return one_time_keyboard;
	}
	
	/**
	 * Optional. Set the requests clients to hide the keyboard as soon as it's been used.
	 * @param one_time_keyboard
	 */
	public void setOneTimeKeyboard(boolean one_time_keyboard)
	{
		this.one_time_keyboard = one_time_keyboard;
	}

	public abstract void addLine(String... strings);
}
