package com.botticelli.bot.request.methods;


import java.util.Map;
/**
 * 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class UpdateRequest extends GetRequest{
	
	private Integer timeout;
	
	/**
	 * Timeout in seconds for long polling. Defaults to 0, i.e. usual short polling
	 * @return
	 */
	public Integer getTimeout()
	{
		return timeout;
	}
	
	/**
	 * Set timeout in seconds for long polling. Defaults to 0, i.e. usual short polling
	 * @param timeout
	 */
	public void setTimeout(Integer timeout)
	{
		this.timeout = timeout;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("timeout", timeout);
		return map;
	}
	
	@Override
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
}
