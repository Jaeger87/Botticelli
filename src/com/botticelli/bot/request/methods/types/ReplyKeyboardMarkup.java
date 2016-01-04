package com.botticelli.bot.request.methods.types;

import java.util.ArrayList;
import java.util.List;

/**
 * This object represents a custom keyboard with reply options 
 * (see Introduction to bots for details and examples).
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ReplyKeyboardMarkup extends ReplyKeyboard{
	
	private List<List<String>> keyboard;
	
	private boolean resize_keyboard;
	
	private boolean one_time_keyboard;
	
	
	public ReplyKeyboardMarkup(List<List<String>> keyboard) 
	{
		this.keyboard = keyboard;
	}
	

	/**
	 * Use this constructor to build a complete replyKeyoard
	 * @param keyboard
	 * @param resize_keyboard
	 * @param one_time_keyboard
	 * @param selective
	 */
	public ReplyKeyboardMarkup(List<List<String>> keyboard, boolean resize_keyboard, 
			boolean one_time_keyboard, boolean selective)
	{
		super(selective);
		this.keyboard = keyboard;
		this.resize_keyboard = resize_keyboard;
		this.one_time_keyboard = one_time_keyboard;
	}
	/**
	 * Array of button rows, each represented by an Array of Strings
	 * @return
	 */
	public List<List<String>> GetKeyboard()
	{
	     ArrayList<List<String>> list = new ArrayList<List<String>>();
	     if (keyboard == null)
	    	 return list;
	     for(List<String> l : keyboard)
	     {
	    	 ArrayList<String> k = new ArrayList<String>(l);
	    	 list.add(k);
	     }
	     return list;
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

}
