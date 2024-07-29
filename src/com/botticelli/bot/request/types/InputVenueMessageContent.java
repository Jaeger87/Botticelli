package com.botticelli.bot.request.types;

public class InputVenueMessageContent extends InputLocationMessageContent{

	private String title;
	private String address;
	private String foursquare_id;
	
	public InputVenueMessageContent(float latitude, float longitude, String title, String address) {
		super(latitude, longitude);
		this.title = title;
		this.address = address;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
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
	
	

}
