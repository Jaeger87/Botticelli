package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

import com.botticelli.bot.request.types.MaskPosition;

public abstract class AbstractAddStickerToSet implements Request{

	private long user_id;
	private String name;
	private String emojis;
	private MaskPosition mask_position;
	
	public AbstractAddStickerToSet(long user_id, String name, String emojis) 
	{
		this.user_id = user_id;
		this.name = name;
		this.emojis = emojis;
	}


	@Override
	public Map<String, Object> getValuesMap() 
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("user_id", user_id);
		map.put("name", name);
		map.put("emojis", emojis);
		map.put("mask_position", mask_position);
		return map;
	}


	public MaskPosition getMask_position() 
	{
		return mask_position;
	}


	public void setMask_position(MaskPosition mask_position) 
	{
		this.mask_position = mask_position;
	}
	
}
