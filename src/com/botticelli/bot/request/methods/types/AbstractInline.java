package com.botticelli.bot.request.methods.types;

/**
 * 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public abstract class AbstractInline
{

	private User from;
	private String query;
	private Location location;
	/**
	 * Sender
	 * @return
	 */
	public User getFrom()
	{
		return from;
	}
	
	/** 
	 * Set the sender
	 * @param from
	 */
	public void setFrom(User from)
	{
		this.from = from;
	}
	
	/**
	 * Text of the query
	 * @return
	 */
	public String getQuery()
	{
		return query;
	}
	
	/**
	 * Set the text of the query
	 * @param query
	 */
	public void setQuery(String query)
	{
		this.query = query;
	}

	/**
	 * 
	 * @return
	 */
	public Location getLocation() 
	{
		return location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(Location location) 
	{
		this.location = location;
	}
	
	
}
