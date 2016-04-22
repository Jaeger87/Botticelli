package com.botticelli.bot.request.methods.types;

import java.util.List;

public class InlineKeyboardMarkup {
	
	private List<List<InlineKeyboardButton>> inline_keyboard;
	
	public InlineKeyboardMarkup(List<List<InlineKeyboardButton>> inline_keyboard)
	{
		this.inline_keyboard = inline_keyboard;
	}
}
