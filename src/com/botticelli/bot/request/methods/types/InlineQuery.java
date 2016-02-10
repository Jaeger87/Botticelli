package com.botticelli.bot.request.methods.types;

/**
 * 
 * @author @author Andrea Rosati (@Jaeger87)
 *
 */
public class InlineQuery
{
	private String id;
	
	private User from;
	
	private String query;
	
	private String offset;
	
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public User getFrom()
	{
		return from;
	}
	
	public void setFrom(User from)
	{
		this.from = from;
	}
	
	public String getQuery()
	{
		return query;
	}
	
	public void setQuery(String query)
	{
		this.query = query;
	}
	
	public String getOffset()
	{
		return offset;
	}
	
	public void setOffset(String offset)
	{
		this.offset = offset;
	}
}
