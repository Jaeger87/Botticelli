package com.botticelli.bot.request.methods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.botticelli.bot.request.types.ShippingOption;

public class AnswerShippingQuery implements Request{

	private String shipping_query_id;
	private boolean ok;
	private List<ShippingOption> shipping_options;
	private String error_message;
	

	public AnswerShippingQuery(String shipping_query_id, boolean ok) 
	{
		this.shipping_query_id = shipping_query_id;
		this.ok = ok;
	}
	
	@Override
	public Map<String, Object> getValuesMap() 
	{
		HashMap <String, Object> map = new HashMap<String, Object>();
		map.put("shipping_query_id", shipping_query_id);
		map.put("ok", ok);
		map.put("shipping_options", shipping_options);
		map.put("error_message", error_message);
		return map;
	}

	public List<ShippingOption> getShippingOptions() 
	{
		return shipping_options;
	}

	public void setShippingOptions(List<ShippingOption> shipping_options) 
	{
		this.shipping_options = shipping_options;
	}

	public String getErrorMessage() 
	{
		return error_message;
	}

	public void setErrorMessage(String error_message) 
	{
		this.error_message = error_message;
	}
	
	
}
