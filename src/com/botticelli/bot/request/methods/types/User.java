package com.botticelli.bot.request.methods.types;

import java.util.Objects;

/**
 * This object represents a Telegram user or bot.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class User{

	private long id;
	
	private String first_name;
	
	private String last_name;
	
	private String username;
	
	private String language_code;
	
	private boolean is_bot;
	
	/**
	 * 
	 * @return
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(long id) 
	{
		this.id = id;
	}


	/**
	 * User�s or bot�s first name
	 * @return
	 */
	public String getFirstName()
	{
		return first_name;
	}
	
	
	/**
	 * Set user�s or bot�s first name
	 * @param first_name
	 */
	public void setFirstName(String first_name)
	{
		this.first_name = first_name;
	}
	
	
	/**
	 * Optional. User�s or bot�s last name
	 * @return
	 */
	public String getLastName()
	{
		return last_name;
	}
	
	
	/**
	 * Optional. Set user�s or bot�s last name
	 * @param last_name
	 */
	public void setLastName(String last_name)
	{
		this.last_name = last_name;
	}
	
	/**
	 * Optional. User�s or bot�s username
	 * @return
	 */
	public String getUserName()
	{
		return username;
	}


	/**
	 * Optional. Set user�s or bot�s username
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	
	@Deprecated
	public boolean isGroupChat() 
	{
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public String getLanguageCode() 
	{
		return language_code;
	}

	/**
	 * 
	 * @param language_code
	 */
	public void setLanguageCode(String language_code) 
	{
		this.language_code = language_code;
	}

	public boolean isIs_bot() 
	{
		return is_bot;
	}

	public void setIs_bot(boolean is_bot) 
	{
		this.is_bot = is_bot;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return id == user.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
