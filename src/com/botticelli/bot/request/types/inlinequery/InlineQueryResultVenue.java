package com.botticelli.bot.request.types.inlinequery;

public class InlineQueryResultVenue extends InlineQueryResultLocation{

	private String address;
	private String foursquare_id;
	
	public InlineQueryResultVenue(String id, String title, float latitude, 
			float longitude, String address) 
	{
		super(id, title, latitude, longitude);
		this.address = address;
	}

	public String getFoursquare_id() 
	{
		return foursquare_id;
	}

	public void setFoursquare_id(String foursquare_id) 
	{
		this.foursquare_id = foursquare_id;
	}

	public String getAddress() 
	{
		return address;
	}

	
}
