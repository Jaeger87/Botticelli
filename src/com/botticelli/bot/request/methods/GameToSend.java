package com.botticelli.bot.request.methods;

import java.util.Map;

public class GameToSend extends AbstractReplyManageToSend{

	private String game_short_name;
	
	public GameToSend(long chat_id, String game_short_name) 
	{
		super(chat_id);
		this.game_short_name = game_short_name;
	}
	
	public GameToSend(String channelusername, String game_short_name) 
	{
		super(channelusername);
		this.game_short_name = game_short_name;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("game_short_name", game_short_name);
		return map;
	}
	/**
	 * 
	 */
	public String toString()
	{
		
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
	
}
