package com.botticelli.bot.request.methods;

import java.util.Map;

public class AddStickerToSetByReferenceOrLink extends AbstractCreateNewStickerSet{

	
	
	private String png_sticker;
	
	public AddStickerToSetByReferenceOrLink(long user_id, String name, String title, String emojis, String png_sticker) 
	{
		super(user_id, name, title, emojis);
		this.png_sticker = png_sticker;
	}

	
	@Override
	public Map<String, Object> getValuesMap() 
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("png_sticker", png_sticker);
		return map;
	}
}
