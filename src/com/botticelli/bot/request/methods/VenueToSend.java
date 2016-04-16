package com.botticelli.bot.request.methods;

import java.util.Map;

public class VenueToSend extends LocationToSend{

	private String title;
	private String address;
	private String foursquare_id;
	
	public VenueToSend(long chat_id, float latitude, float longitude, String title, String address) 
	{
		super(chat_id, latitude, longitude);
		intialize(title, address);
	}

	public VenueToSend(long chat_id, float latitude, float longitude, String title, String address, String foursquare_id) 
	{
		super(chat_id, latitude, longitude);
		intialize(title, address);
		this.foursquare_id = foursquare_id;
	}
	
	public VenueToSend(String channelusername, float latitude, float longitude, String title, String address) 
	{
		super(channelusername, latitude, longitude);
		intialize(title, address);
	}

	public VenueToSend(String channelusername, float latitude, float longitude, String title, String address, String foursquare_id) 
	{
		super(channelusername, latitude, longitude);
		intialize(title, address);
		this.foursquare_id = foursquare_id;
	}
	
	private void intialize(String title, String address)
	{
		this.title = title;
		this.address = address;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("title", title);
		map.put("address", address);
		map.put("foursquare_id", foursquare_id);
		return map;
	}
	
}
