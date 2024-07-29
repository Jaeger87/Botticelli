package com.botticelli.bot.request.types.inlinequery;

public class InlineQueryResultGame extends InlineQueryResult{

	
	public final String type = "game";
	private String game_short_name;
	
	public InlineQueryResultGame(String id) {
		super(id);
	}

	public String getGame_short_name() {
		return game_short_name;
	}

	
	
}
