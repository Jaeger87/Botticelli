package com.botticelli.bot.request.types;

import java.util.List;

public class StickerSet {

	private String name;
	private String title;
	private boolean contains_masks;
	private List<Sticker> stickers;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public boolean isContains_masks() 
	{
		return contains_masks;
	}
	
	public void setContains_masks(boolean contains_masks)
	{
		this.contains_masks = contains_masks;
	}
	
	public List<Sticker> getStickers()
	{
		return stickers;
	}
	
	public void setStickers(List<Sticker> stickers)
	{
		this.stickers = stickers;
	}
	
	
}
