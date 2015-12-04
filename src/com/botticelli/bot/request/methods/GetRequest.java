package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.Map;

public abstract class GetRequest implements Request{

	private Integer offset;
	
	private Integer limit;
	
	/**
	 * Identifier of the first update to be returned. 
	 * Must be greater by one than the highest among the identifiers of previously received updates. 
	 * By default, updates starting with the earliest unconfirmed update are returned. 
	 * An update is considered confirmed as soon as getUpdates is called with an offset higher than its update_id.
	 * @return
	 */
	public Integer getOffset()
	{
		return offset;
	}
	
	/**
	 * Limits the number of updates to be retrieved. 
	 * Values between 1—100 are accepted. Defaults to 100
	 * @return
	 */
	public Integer getLimit()
	{
	    return limit;
	}
	
	/**
	 * Set the offset
	 * @param offset
	 */
	public void setOffset(Integer offset)
	{
		this.offset = offset;
	}
	
	/**
	 * Set the limits the number of updates to be retrieved.
	 * @param limit
	 */
	public void setLimit(Integer limit)
	{
		if(limit.intValue() > 0 && limit.intValue() < 101)
		    this.limit = limit;
	}
	
	public Map<String, Object> getValuesMap()
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("offset", offset);
		map.put("limit", limit);
		return map;
	}
}
