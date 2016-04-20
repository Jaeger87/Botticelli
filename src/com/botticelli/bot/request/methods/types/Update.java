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
	
	private ChosenInlineResult chosen_inline_result;
	
	private CallbackQuery callback_query; 
	


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
	 * Check if the update contains a message, remember any update contains a message OR an inline query OR a chosen inline result.
	 * @return
	 */
	public boolean isMessageUpdate()
	{
		return message != null;
	}
	
	/**
	 * Check if the update contains a chosen inline result, remember any update contains a message OR an inline query OR a chosen inline result.
	 * @return
	 */
	public boolean isCheckInlineResultUpdate()
	{
		return chosen_inline_result != null;
	}
	
	/**
	 * Check if the update contains an inline query, remember any update contains a message OR an inline query OR a chosen inline result.
	 * @return
	 */
	public boolean isInlineQueryUpdate()
	{
		return inline_query != null;
	}
	
	/**
	 * Optional. The result of an inline query that was chosen by a user and sent to their chat partner.
	 * @return
	 */
	public ChosenInlineResult getChosenInlineResult()
	{
		return chosen_inline_result;
	}
	
	/**
	 * 
	 * @return
	 */
	public CallbackQuery getCallback_query() 
	{
		return callback_query;
	}
	
	public boolean isCallbackUpdate()
	{
		return callback_query != null;
	}
}
