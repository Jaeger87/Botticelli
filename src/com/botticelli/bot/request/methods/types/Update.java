package com.botticelli.bot.request.methods.types;

/**
 * This object represents an incoming update. 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Update {

	private int update_id;
	
	private Message message;
	
	private InlineQuery inline_query;
	
	/**
	 * The update‘s unique identifier. 
	 * Update identifiers start from a certain positive number and increase sequentially. 
	 * This ID becomes especially handy if you’re using Webhooks, 
	 * since it allows you to ignore repeated updates or to restore the correct update sequence, 
	 * should they get out of order.
	 * @return
	 */
	public int getUpdateID()
	{
		return update_id;
	}
	
	/**
	 * Optional. New incoming message of any kind — text, photo, sticker, etc.
	 * @return
	 */
	public Message getMessage()
	{
		return message;
	}
	
	/**
	 * Optional. New incoming inline query
	 * @return
	 */
	public InlineQuery getInlineQuery()
	{
		return inline_query;
	}
	
	/**
	 * Check if the update contains a message, remember any update contains a message OR an inline query.
	 * @return
	 */
	public boolean isMessageUpdate()
	{
		return message != null;
	}
}
