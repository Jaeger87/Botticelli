package com.botticelli.bot.request.methods;

import java.util.Map;

/**
 * This object clusters all the data need for the method sendLocation
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class LocationToSend extends AbstractReplyManageToSend{

	private float latitude;
	private float longitude;
	private int live_period;
	
	public LocationToSend(long chat_id, float latitude, float longitude) 
	{
		super(chat_id);
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public LocationToSend(String channelusername, float latitude, float longitude) 
	{
		super(channelusername);
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	/**
	 * Longitude of location
	 * @return
	 */
	public float getLongitude()
	{
		return longitude;
	}
	
	/**
	 * Latitude of location
	 * @return
	 */
	public float getLatidute()
	{
		return latitude;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public int getLive_period() 
	{
		return live_period;
	}

	/**
	 * Period in seconds for which the location will be updated 
	 * (see Live Locations, should be between 60 and 86400.
	 * @param live_period
	 */
	public void setLive_period(int live_period) 
	{
		this.live_period = live_period;
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("latitude", new Float(latitude));
		map.put("longitude", new Float(longitude));
		return map;
	}
	
	@Override
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
}
