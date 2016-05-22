package com.botticelli.bot.request.methods.types;
/**
 * This object represents a sticker.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Sticker extends PhotoSize{
	
	private PhotoSize thumb;
	private String emoji;
	
	/**
	 * Optional. Sticker thumbnail in .webp or .jpg format
	 * @return
	 */
	public PhotoSize getThumb()
	{
		return thumb;
	}
	
	/**
	 * Optional. Set sticker thumbnail in .webp or .jpg format
	 */
	public void setThumb(PhotoSize thumb)
	{
		this.thumb = thumb;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmoji() 
	{
		return emoji;
	}

	/**
	 * 
	 * @param emoji
	 */
	public void setEmoji(String emoji) 
	{
		this.emoji = emoji;
	}
	
	
}
