package com.botticelli.bot.request.methods.types;
/**
 * This object represents a phone contact.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Contact {

	private String phone_number;
	
	private String first_name;
	
	private String last_name;
	
	private int user_id;
	
	/**
	 * Contact's phone number
	 * @return
	 */
	public String getPhoneNumber()
	{
		return phone_number;
	}
	
	
	/**
	 * Set the contact's phone number
	 * @param phone_number
	 */
	public void setPhoneNumber(String phone_number)
	{
		this.phone_number = phone_number;
	}
	/**
	 * Contact's first name
	 * @return
	 */
	public String getFirstName()
	{
		return first_name;
	}
	
	/**
	 * Set the contact's first name
	 * @param first_name
	 */
	public void setFirstName(String first_name)
	{
		this.first_name = first_name;
	}
	
	/**
	 * Optional. Contact's last name
	 * @return
	 */
	public String getLastName()
	{
		return last_name;
	}
	
	/**
	 * Optional. Set the contact's last name
	 * @param last_name
	 */
	public void setLastName(String last_name)
	{
		this.last_name = last_name;
	}
	/**
	 * Optional. Contact's user identifier in Telegram
	 * @return
	 */
	public int getUserId()
	{
		return user_id;
	}
	
	/**
	 * Optional. Set contact's user identifier in Telegram
	 */
	public void setUserid(int user_id)
	{
		this.user_id = user_id;
	}
}
