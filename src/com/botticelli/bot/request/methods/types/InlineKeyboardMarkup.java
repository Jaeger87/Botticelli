package com.botticelli.bot.request.methods.types;

import java.util.List;

public class InlineKeyboardMarkup implements Keyboard{
	
	private List<List<InlineKeyboardButton>> inline_keyboard;
	
	public InlineKeyboardMarkup(List<List<InlineKeyboardButton>> inline_keyboard)
	{
		this.inline_keyboard = inline_keyboard;
	}
	
	@Override
	public String toString()
	{
		return GsonOwner.getInstance().getGson().toJson(this);
	}
	
	public void AddLine(List<InlineKeyboardButton> line)
	{
		if(line == null)
			return;
		inline_keyboard.add(line);
	}
	
}
