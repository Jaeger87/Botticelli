package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.botticelli.bot.request.methods.types.InlineQueryResult;
import com.google.gson.Gson;

public class AnswerInlineQueryRequest implements Request
{
	private String inline_query_id;
	
	private List<InlineQueryResult> results;
	
	private int cache_time;

	private boolean is_personal;
	
	private String next_offset;
	
	private String switch_pm_text;
	
	
	
	public AnswerInlineQueryRequest(String inline_query_id, List<InlineQueryResult> results)
	{
		this.inline_query_id = inline_query_id;
		this.results = results;
	}
	
	public int getCacheTime()
	{
		return cache_time;
	}

	public void setCacheTime(int cache_time)
	{
		if(cache_time < 0)
			return;
		this.cache_time = cache_time;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isPersonal()
	{
		return is_personal;
	}

	public void setIsPersonalOn()
	{
		is_personal = true;
	}
	/**
	 * 
	 */
	public void setIsPersonalOff()
	{
		is_personal = false;
	}

	/**
	 * 
	 * @return
	 */
	public String getNextOffset()
	{
		return next_offset;
	}

	public void setNextOffset(String next_offset)
	{
		this.next_offset = next_offset;
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		if(results == null)
			return map;
		Gson gson = new Gson();
		
		map.put("inline_query_id", inline_query_id);
		map.put("results", gson.toJson(results));
		map.put("cache_time", cache_time);
		map.put("is_personal", is_personal);
		map.put("next_offset", next_offset);
		map.put("switch_pm_text", switch_pm_text);
		return map;
	}

	/**
	 * 
	 * @param switch_pm_text
	 */
	public void setSwitch_pm_text(String switch_pm_text) 
	{
		this.switch_pm_text = switch_pm_text;
	}

	/**
	 * 
	 * @return
	 */
	public String getSwitch_pm_text() 
	{
		return switch_pm_text;
	}

}
