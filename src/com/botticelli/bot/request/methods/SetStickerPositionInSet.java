package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public class SetStickerPositionInSet implements Request{

	private String sticker;
	private int position;
		
	public SetStickerPositionInSet(String sticker, int position) 
	{
		this.sticker = sticker;
		this.position = position;
	}


	@Override
	public Map<String, Object> getValuesMap() {
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("sticker", sticker);
		map.put("position", position);
		return map;
	}

}
