package com.botticelli.bot.request.methods.types;

import java.util.List;

public class ShippingOption {

	private String id;
	private String title;
	private List<LabeledPrice> prices;
	
	public ShippingOption() 
	{
		
	}

	public ShippingOption(String id, String title, List<LabeledPrice> prices) 
	{
		this.id = id;
		this.title = title;
		this.prices = prices;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public List<LabeledPrice> getPrices() 
	{
		return prices;
	}

	public void setPrices(List<LabeledPrice> prices) 
	{
		this.prices = prices;
	}
	
	
	
	
}
