package com.botticelli.bot.request.types.replykeyboard;
/**
 * Upon receiving a message with this object, 
 * Telegram clients will hide the current custom keyboard and display the default letter-keyboard. 
 * By default, custom keyboards are displayed until a new keyboard is sent by a bot. 
 * An exception is made for one-time keyboards that are hidden immediately after the user presses a button (see ReplyKeyboardMarkup).
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ReplyKeyboardHide extends ReplyKeyboard{
	
	private boolean hide_keyboard;

	public ReplyKeyboardHide() 
	{
		hide_keyboard = true;
	}
	/**
	 * Use this constructor to set immediately selective parameter
	 * @param selective
	 */
	public ReplyKeyboardHide(boolean selective)
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
