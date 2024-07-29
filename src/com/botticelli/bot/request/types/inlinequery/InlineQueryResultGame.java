package com.botticelli.bot.request.types.inlinequery;

public class InlineQueryResultGame extends InlineQueryResult{

	
	public final String type = "game";
	
	public InlineQueryResultGame(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	private String game_short_name;
	
	
}
