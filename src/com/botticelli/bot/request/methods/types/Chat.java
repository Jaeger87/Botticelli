package com.botticelli.bot.request.methods.types;

/**
 * This object represent a generic Chat.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public abstract class Chat {

	private int id;
	private String type;
	/**
	 * Unique identifier for this Chat
	 * @return
	 */
	public int getId()
	{
		return id;
	}
	
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
	 * Set the Id chat
	 * @param id
	 */
	public void setID(int id)
	{
		this.id = id;
	}
	
	public abstract boolean isGroupChat();
}
