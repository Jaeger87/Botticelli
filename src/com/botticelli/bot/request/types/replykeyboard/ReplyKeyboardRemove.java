package com.botticelli.bot.request.types.replykeyboard;

public class ReplyKeyboardRemove extends ReplyKeyboard{
	
	private boolean remove_keyboard;

	public ReplyKeyboardRemove() 
	{
		remove_keyboard = true;
	}
	/**
	 * Use this constructor to set immediately selective parameter
	 * @param selective
	 */
	public ReplyKeyboardRemove(boolean selective)
	{
		super(selective);
		remove_keyboard = true;
	}
	/**
	 * Requests clients to hide the custom keyboard
	 * @return
	 */
	public boolean getHideKeyboard()
	{
		return remove_keyboard;
	}

}
