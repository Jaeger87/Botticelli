package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

import com.botticelli.bot.request.methods.types.MaskPosition;

public abstract class AbstractCreateNewStickerSet implements Request{

	
	private long user_id;
	private String name;
	private String title;
	private String emojis;
	private boolean contains_masks;
	private MaskPosition mask_position;
	
	
	
	
	public AbstractCreateNewStickerSet(long user_id, String name, String title,
			String emojis) {
		this.user_id = user_id;
		this.name = name;
		this.title = title;
		this.emojis = emojis;
	}




	@Override
	public Map<String, Object> getValuesMap() 
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("user_id", user_id);
		map.put("name", name);
		map.put("title", title);
		map.put("emojis", emojis);
		map.put("contains_masks", contains_masks);
		map.put("mask_position", mask_position);
		return map;
	}




	public boolean isContains_masks() 
	{
		return contains_masks;
	}


	public void setContains_masks(boolean contains_masks) 
	{
		this.contains_masks = contains_masks;
	}


	public MaskPosition getMask_position() {
		return mask_position;
	}


	public void setMask_position(MaskPosition mask_position)
	{
		this.mask_position = mask_position;
	}

}
