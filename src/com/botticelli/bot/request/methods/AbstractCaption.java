package com.botticelli.bot.request.methods;

import com.botticelli.bot.request.types.ParseMode;

import java.util.Map;

public abstract class AbstractCaption extends AbstractReplyManageToSend{

	private String caption;
	private ParseMode parse_mode;
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
		map.put("parse_mode", parse_mode);
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

	public ParseMode getParse_mode() {
		return parse_mode;
	}

	public void setParse_mode(ParseMode parse_mode) {
		this.parse_mode = parse_mode;
	}
}
