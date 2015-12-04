package com.botticelli.bot.request.methods.types;

/**
 * This object represents a Telegram user or bot.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class User extends Chat{

	private String first_name;
	
	private String last_name;
	
	private String username;
	
	private String title; //Da spiegare
	
	/**
	 * User‘s or bot’s first name
	 * @return
	 */
	public String getFirstName()
	{
		return first_name;
	}
	
	
	/**
	 * Set user‘s or bot’s first name
	 * @param first_name
	 */
	public void setFirstName(String first_name)
	{
		this.first_name = first_name;
	}
	
	
	/**
	 * Optional. User‘s or bot’s last name
	 * @return
	 */
	public String getLastName()
	{
		return last_name;
	}
	
	
	/**
	 * Optional. Set user‘s or bot’s last name
	 * @param last_name
	 */
	public void setLastName(String last_name)
	{
		this.last_name = last_name;
	}
	
	/**
	 * Optional. User‘s or bot’s username
	 * @return
	 */
	public String getUserName()
	{
		return username;
	}


	/**
	 * Optional. Set user‘s or bot’s username
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	
	@Override
	public boolean isGroupChat() 
	{
		return false;
	}
	
	protected String getTitle()
	{
		return title;
	}
}
