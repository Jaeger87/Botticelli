package com.botticelli.bot.request.methods;

import java.util.Map;

public class UserProfilePhotosRequest extends GetRequest{
	
	private int user_id;
	
	public UserProfilePhotosRequest(int user_id)
	{
		this.user_id = user_id;
	}

	/**
	 * Unique identifier of the target user
	 * @return
	 */
	public int getUserID()
	{
		return user_id;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("user_id", new Integer(user_id));
		return map;
	}
	
	@Override
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
}
