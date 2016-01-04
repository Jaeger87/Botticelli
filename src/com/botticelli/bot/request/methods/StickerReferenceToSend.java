package com.botticelli.bot.request.methods;

import java.util.Map;
/**
 * This object clusters all the data need for the method send Sticker 
 * (in this case the Sticker is a telegram file_id)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class StickerReferenceToSend extends AbstractReplyManageToSend{
	
	private String sticker;
	
	public StickerReferenceToSend(long chat_id, String sticker) 
	{
		super(chat_id);
		this.sticker = sticker;
	}

	public StickerReferenceToSend(String channelusername, String sticker) 
	{
		super(channelusername);
		this.sticker = sticker;
	}
	
	public String getSticker()
	{
		return sticker;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("sticker", sticker);
		return map;
	}
	
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}

}
