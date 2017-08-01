package com.botticelli.bot.request.methods;

import java.util.Map;

public class CreateNewStickerSetByReferenceOrLinkRequest extends AbstractCreateNewStickerSet{

	private String png_sticker;
	
	public CreateNewStickerSetByReferenceOrLinkRequest(long user_id, String name, String title, String png_sticker,
			String emojis) 
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
