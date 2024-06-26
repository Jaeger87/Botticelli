package com.botticelli.bot.request.methods.types.replykeyboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This object represents a custom keyboard with reply options 
 * (see Introduction to bots for details and examples).
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ReplyKeyboardMarkup extends AbstractReplyKeyboardMarkup {
	
	private List<List<String>> keyboard;
	
	
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
		super(resize_keyboard, one_time_keyboard, selective);
		this.keyboard = keyboard;
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


	@Override
	public void addLine(String... strings) 
	{
		keyboard.add(Arrays.asList(strings));
	}
	
}
