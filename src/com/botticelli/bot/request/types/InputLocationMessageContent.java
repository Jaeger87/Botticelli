package com.botticelli.bot.request.types;

public class InputLocationMessageContent implements InputMessageContent{
	
	private float latitude;
	private float longitude;
	
	public InputLocationMessageContent(float latitude, float longitude) 
	{
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * 
	 * @return
	 */
	public float getLatitude() 
	{
		return latitude;
	}

	/**
	 * 
	 * @param latitude
	 */
	public void setLatitude(float latitude) 
	{
		this.latitude = latitude;
	}

	/**
	 * 
	 * @return
	 */
	public float getLongitude()
	{
		return longitude;
	}

	/**
	 * 
	 * @param longitude
	 */
	public void setLongitude(float longitude)
    {
		this.longitude = longitude;
	}

	
	
}
