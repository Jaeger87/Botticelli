package com.botticelli.bot.request.methods.types;

public class PhotoSize extends TelegramFile{
	
	private int width;
	
	private int height;
	
	/**
	 * Photo width
	 * @return
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * Set photo width
	 * @param width
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	/**
	 * Photo height
	 * @return
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Set photo height
	 * @param height
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
}
