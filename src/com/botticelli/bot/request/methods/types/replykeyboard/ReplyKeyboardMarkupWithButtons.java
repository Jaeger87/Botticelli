package com.botticelli.bot.request.methods.types.replykeyboard;

import com.botticelli.bot.request.methods.types.KeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class ReplyKeyboardMarkupWithButtons extends AbstractReplyKeyboardMarkup {

	private List<List<KeyboardButton>> keyboard;

	public ReplyKeyboardMarkupWithButtons(List<List<KeyboardButton>> keyboard) 
	{
		this.keyboard = keyboard;
	}

	public ReplyKeyboardMarkupWithButtons(List<List<KeyboardButton>> keyboard, boolean resize_keyboard, boolean one_time_keyboard,
			boolean selective) 
	{
		super(resize_keyboard, one_time_keyboard, selective);
		this.keyboard = keyboard;
	}
	
	public List<List<KeyboardButton>> getKeyboard()
	{
	     ArrayList<List<KeyboardButton>> list = new ArrayList<List<KeyboardButton>>();
	     if (keyboard == null)
	    	 return list;
	     for(List<KeyboardButton> l : keyboard)
	     {
	    	 ArrayList<KeyboardButton> k = new ArrayList<KeyboardButton>(l);
	    	 list.add(k);
	     }
	     return list;
	}

	@Override
	public void addLine(String... strings) {
		ArrayList<KeyboardButton> kbl = new ArrayList<>();
		for(int i = 0; i < strings.length; i++)
			kbl.add(new KeyboardButton(strings[i]));
		keyboard.add(kbl);
		
	}
    
	
	
}
