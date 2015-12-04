package com.botticelli.bot.request.methods.types;
/**
 * This object represents a group chat.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class GroupChat extends Chat{
	
	private String title;
	
	public GroupChat()
	{
		
	}
	
	protected GroupChat(String title, int id)
	{
		super.setID(id);
		this.title = title;
	}
	
	/**
	 * Group name
	 * @return
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Set the group name
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Return that this object is a GroupChat
	 */
	@Override
	public boolean isGroupChat() 
	{
		return true;
	}

}
