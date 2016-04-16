package com.botticelli.bot.request.methods;

import java.util.Map;

public class ContactToSend extends AbstractReplyManageToSend{

	private String phone_number;
	private String first_name;
	private String last_name;
	
	public ContactToSend(long chat_id, String phone_number, String first_name) 
	{
		super(chat_id);
		this.phone_number = phone_number;
		this.first_name = first_name;
	}

	public ContactToSend(String channelusername, String phone_number, String first_name) 
	{
		super(channelusername);
		this.phone_number = phone_number;
		this.first_name = first_name;
	}

	/**
	 * 
	 * @param last_name
	 */
	public void setLast_name(String last_name) 
	{
		this.last_name = last_name;
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("phone_number", phone_number);
		map.put("first_name", first_name);
		map.put("last_name", last_name);
		return map;
	}
	
}
