package com.botticelli.bot.request.methods.types;

/**
 * Represent the return message for the send methods
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ResultMessage extends Result
{	
	private Message result;
	
	/**
	 * The message
	 * @return
	 */
	public Message getResult()
	{
		return result;
	}
}
