package com.botticelli.bot.request.methods.types;

public class ResultWithDescription extends Result{
	
	private int error_code;
	private String description;
	
	public int getError_code() 
	{
		return error_code;
	}
	
	public String getDescription() 
	{
		return description;
	}

}
