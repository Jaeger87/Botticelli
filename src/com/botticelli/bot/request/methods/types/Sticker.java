package com.botticelli.bot.request.methods.types;
/**
 * This object represents a sticker.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Sticker extends PhotoSize{
	
	private PhotoSize thumb;
	private String emoji;
	private MaskPosition mask_position;
	private String set_name;
	
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

	public MaskPosition getMask_position() 
	{
		return mask_position;
	}

	public void setMask_position(MaskPosition mask_position) 
	{
		this.mask_position = mask_position;
	}

	public String getSet_name() 
	{
		return set_name;
	}

	public void setSet_name(String set_name) 
	{
		this.set_name = set_name;
	}
	
	
	
}
