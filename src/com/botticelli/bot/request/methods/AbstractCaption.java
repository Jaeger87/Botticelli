package com.botticelli.bot.request.methods;

import java.util.Map;

public abstract class AbstractCaption extends AbstractReplyManageToSend{

	private String caption;
	public final static int MAXCAPTIONLENGHT = 200;
	
	public AbstractCaption(long chat_id) 
	{
		super(chat_id);
	}

	public AbstractCaption(String channelusername) 
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

	public String getCaption() 
	{
		return caption;
	}

	public void setCaption(String caption) 
	{
		if(caption != null && caption.length() > MAXCAPTIONLENGHT)
			return;
		this.caption = caption;
	}
	
	
	
}
