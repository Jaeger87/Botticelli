package com.botticelli.bot.request.methods.types;

/**
 * This object represents an incoming inline query. When the user sends an empty query,
 *  your bot could return some default or trending results.
 * @author @author Andrea Rosati (@Jaeger87)
 *
 */
public class InlineQuery extends AbstractInline
{
	private String id;
	
	private String offset;
	
	/**
	 * Unique identifier for this query
	 * @return
	 */
	public String getId()
	{
		return id;
	}
	/**
	 * Set the unique identifier for this query
	 * @param id
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	/**
	 * Offset of the results to be returned, can be controlled by the bot
	 * @return
	 */
	public String getOffset()
	{
		return offset;
	}
	
	/**
	 * Set the offset of the results to be returned, can be controlled by the bot 	
	 * @param offset
	 */
	public void setOffset(String offset)
	{
		this.offset = offset;
	}
	
}
