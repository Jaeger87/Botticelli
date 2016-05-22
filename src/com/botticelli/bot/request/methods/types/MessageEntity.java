package com.botticelli.bot.request.methods.types;

public class MessageEntity {
	
	private MessageEntityType type;
	private int offset;
	private int length;
	private String url;
	
	/**
	 *  Type of the entity. Can be mention (@username), hashtag, bot_command, url, email, bold (bold text), italic (italic text), 
	 *  code (monowidth string), pre (monowidth block), text_link (for clickable text URLs), text_mention (for users without usernames)
	 * @return
	 */
	public MessageEntityType getType() 
	{
		return type;
	}
	
	/**
	 * Set the type of the entity
	 * @param type
	 */
	public void setType(MessageEntityType type) 
	{
		this.type = type;
	}
	
	/**
	 * Get the offset in UTF-16 code units to the start of the entity
	 * @return
	 */
	public int getOffset() 
	{
		return offset;
	}
	
	/**
	 * Set the offset in UTF-16 code units to the start of the entity
	 * @param offset
	 */
	public void setOffset(int offset) 
	{
		this.offset = offset;
	}
	
	/**
	 * Get the length of the entity in UTF-16 code units
	 * @return
	 */
	public int getLength() 
	{
		return length;
	}
	
	/**
	 * Set the length of the entity in UTF-16 code units
	 * @param length
	 */
	public void setLength(int length) 
	{
		this.length = length;
	}
	
	/**
	 * Optional. For “text_link” only, url that will be opened after user taps on the text
	 * @return
	 */
	public String getUrl() 
	{
		return url;
	}
	
	/**
	 * Set the url that will be opened after user taps on the text
	 * @param url
	 */
	public void setUrl(String url) 
	{
		this.url = url;
	}
	
	

}
