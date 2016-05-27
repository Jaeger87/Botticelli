package com.botticelli.bot.request.methods.types;

/**
 * Represente a common Result for a get request
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Result <T>{

	private boolean ok;
	private T result;
	private int error_code;
	private String description;
	/**
	 * If ‘ok’ equals true, the request was successful 
	 * and the result of the query can be found in the ‘result’ field
	 * @return
	 */
	public boolean getOk()
	{
		return ok;
	}
	
	public T getResult()
	{
		return result;
	}

	public int getError_code() 
	{
		return error_code;
	}

	public String getDescription() 
	{
		return description;
	}
	
	
}
