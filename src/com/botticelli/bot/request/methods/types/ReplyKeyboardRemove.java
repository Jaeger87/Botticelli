package com.botticelli.bot.request.methods.types;

public class ReplyKeyboardRemove extends ReplyKeyboard{
	
	private boolean hide_keyboard;

	public ReplyKeyboardRemove() 
	{
		hide_keyboard = true;
	}
	/**
	 * Use this constructor to set immediately selective parameter
	 * @param selective
	 */
	public ReplyKeyboardRemove(boolean selective)
	{
		super(selective);
		hide_keyboard = true;
	}
	/**
	 * Requests clients to hide the custom keyboard
	 * @return
	 */
	public boolean getHideKeyboard()
	{
		return hide_keyboard;
	}

}
