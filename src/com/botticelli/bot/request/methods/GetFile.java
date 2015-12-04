package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class GetFile implements Request{

	private String file_id;
	
	public GetFile(String file_id)
	{
		this.file_id = file_id;
	}

	@Override
	public Map<String, Object> getValuesMap() 
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("file_id", file_id);
		return map;
	}
	
	
}
