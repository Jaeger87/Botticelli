package com.botticelli.bot.request.methods;

import java.util.Map;

public abstract class PhotoToSend extends AbstractReplyManageToSend{

	private String caption;
	
	public PhotoToSend(int chat_id) 
	{
		super(chat_id);
	}

	public PhotoToSend(String channelusername) 
	{
		super(channelusername);
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("caption", caption);
		return map;
	}
	
	/**
	 * Set the Photo caption
	 * @param caption
	 */
	public void setCaption(String caption)
	{
		this.caption = caption;
	}
	
	/**
	 * Photo caption (may also be used when resending photos by file_id).
	 * @return
	 */
	public String getCaption()
	{
		return caption;
	}
}
