package com.botticelli.bot.request.types.inlinequery;

public class InlineQueryResultContact extends InlineQueryResult{

	public final String type = "contact";
	private String phone_number;
	private String first_name;
	private String last_name;
	private String thumb_url;
	private String thumb_width;
	private String thumb_height;
	
	
	public InlineQueryResultContact(String id, String phone_number, String first_name) 
	{
		super(id);
	}

	@Override
	public void setTitle(String title)
	{
		
	}

	public String getLast_name() 
	{
		return last_name;
	}

	public void setLast_name(String last_name) 
	{
		this.last_name = last_name;
	}

	public String getThumb_url() 
	{
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) 
	{
		this.thumb_url = thumb_url;
	}

	public String getThumb_width() 
	{
		return thumb_width;
	}

	public void setThumb_width(String thumb_width) 
	{
		this.thumb_width = thumb_width;
	}

	public String getThumb_height() 
	{
		return thumb_height;
	}

	public void setThumb_height(String thumb_height) 
	{
		this.thumb_height = thumb_height;
	}

	public String getPhone_number() 
	{
		return phone_number;
	}

	public String getFirst_name() 
	{
		return first_name;
	}
	
	
	
}
