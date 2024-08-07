package com.botticelli.bot.request.methods.types.replykeyboard;

import com.botticelli.bot.request.methods.types.GsonOwner;
import com.botticelli.bot.request.methods.types.Keyboard;

public abstract class ReplyKeyboard implements Keyboard {
	
	private boolean selective;

	
	public ReplyKeyboard() 
	{

	}
	
	public ReplyKeyboard(boolean selective)
	{
		this.selective = selective;
	}
	/**
	 * Optional. Use this parameter if you want to show the keyboard to specific users only. 
	 * Targets: 
	 * 1) users that are @mentioned in the text of the Message object; 
	 * 2) if the bot's message is a reply (has reply_to_message_id), 
	 * sender of the original message.
	 * 
	 * 
     * Example: 
     * A user requests to change the bot�s language, 
     * bot replies to the request with a keyboard to select the new language. 
     * Other users in the group don�t see the keyboard.
	 * @return
	 */
	public boolean getSelective()
	{
		return selective;
	}
	
	/**
	 * Optional. Use this parameter if you want to show the keyboard to specific users only. 
	 */
	public void setSelective(boolean selective)
	{
		this.selective = selective;
	}
	
	@Override
	public String toString()
	{
		return GsonOwner.getInstance().getGson().toJson(this);
	}
}
