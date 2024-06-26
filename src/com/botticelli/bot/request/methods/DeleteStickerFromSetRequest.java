package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class DeleteStickerFromSetRequest implements Request{

	private String sticker;
		
	public DeleteStickerFromSetRequest(String sticker) 
	{
		this.sticker = sticker;
	}

	@Override
	public Map<String, Object> getValuesMap() {
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("sticker", sticker);
		return map;
	}
}
