package com.botticelli.bot.request.methods.types;
/**
 * This object represents a point on the map.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Location {
	
	private float longitude;
	
	private float latitude;

	/**
	 * Longitude as defined by sender
	 * @return
	 */
	public float getLongitude()
	{
		return longitude;
	}
	
	private boolean check(float coordinate)
	{
		if(coordinate < 0 || coordinate > 180)
			return false;
		return true;
	}
	
	/**
	 * Set the longitude
	 * @param longitude
	 */
	public void setLongitude(float longitude)
	{
		if(check(longitude))
		    this.longitude = longitude;
	}
	/**
	 * Latitude as defined by sender
	 * @return
	 */
	public float getLatitude()
	{
		return latitude;
	}
	
	/**
	 * Set the latitude
	 */
	public void setLatitude(float latitude)
	{
		if(check(latitude))
			this.latitude = latitude;
	}
}
