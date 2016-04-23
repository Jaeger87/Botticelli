package com.botticelli.bot.request.methods.types;

public abstract class InlineQueryResultWithDescription extends InlineQueryResult
{

	private String description;
	
	public InlineQueryResultWithDescription(String id, String title)
	{
		super(id, title);
	}

	public InlineQueryResultWithDescription(String id)
	{
		super(id);
	}
	
	
	public String getDescrption()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
}
