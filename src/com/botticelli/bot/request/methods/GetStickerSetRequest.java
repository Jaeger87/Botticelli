package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class GetStickerSetRequest implements Request{

	
	private String name;
	
	public GetStickerSetRequest(String name) 
	{
		this.name = name;
	}


	public Map<String, Object> getValuesMap()
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		return map;
	}
}
