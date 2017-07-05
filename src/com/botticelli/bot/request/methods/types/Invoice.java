package com.botticelli.bot.request.methods.types;

public class Invoice {

	
	private String title;
	
	private String description;
	
	private String start_parameter;
	
	private Currency currency;
	
	private int total_amount;

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getStart_parameter() 
	{
		return start_parameter;
	}

	public void setStart_parameter(String start_parameter) 
	{
		this.start_parameter = start_parameter;
	}

	public Currency getCurrency() 
	{
		return currency;
	}

	public void setCurrency(Currency currency) 
	{
		this.currency = currency;
	}

	public int getTotal_amount() 
	{
		return total_amount;
	}

	public void setTotal_amount(int total_amount) 
	{
		this.total_amount = total_amount;
	}
	
	
	
}
