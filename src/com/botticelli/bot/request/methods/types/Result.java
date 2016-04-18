package com.botticelli.bot.request.methods.types;

/**
 * Represente a common Result for a get request
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public abstract class Result 
{
	private boolean ok;
	
	/**
	 * If ‘ok’ equals true, the request was successful 
	 * and the result of the query can be found in the ‘result’ field
	 * @return
	 */
	public boolean getOk()
	{
		return ok;
	}

}
