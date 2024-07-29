package com.botticelli.bot.request.types;

public class Venue {
	
	private Location location;
	private String title;
	private String address;
	private String foursquare_id;
	
	/**
	 * Get the venue location
	 * @return
	 */
	public Location getLocation() {
		return location;
	}
	
	/**
	 * Set the venue location
	 * @param location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	
	/**
	 * Get the name of the venue
	 * @return
	 */
	public String getTitle() 
	{
		return title;
	}
	/**
	 * Set the name of the venue
	 * @param title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	/**
	 * Get the address of the venue
	 * @return
	 */
	public String getAddress() 
	{
		return address;
	}
	/**
	 * Set the address of the venue
	 * @param address
	 */
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	/**
	 * Optional. Get the Foursquare identifier of the venue
	 * @return
	 */
	public String getFoursquare_id() 
	{
		return foursquare_id;
	}
	/**
	 * Optional. Set the Foursquare identifier of the venue
	 * @param foursquare_id
	 */
	public void setFoursquare_id(String foursquare_id) 
	{
		this.foursquare_id = foursquare_id;
	}
	


}
