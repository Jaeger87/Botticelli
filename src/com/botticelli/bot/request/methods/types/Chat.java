package com.botticelli.bot.request.methods.types;

/**
 * This object represent a generic Chat.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Chat extends User{

	
	private String type;
	private String title;

	
	/**
	 * Type of chat, can be either “private”, “group”, “supergroup” or “channel”
	 * @return
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * Set the type
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	/**
	 * 
	 * @return
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	

}
