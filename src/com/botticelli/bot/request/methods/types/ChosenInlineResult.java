package com.botticelli.bot.request.methods.types;

/**
 * This object represents a result of an inline query
 * that was chosen by the user and sent to their chat partner. 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ChosenInlineResult extends AbstractInline
{
	
	private String result_id;
	/**
	 * The unique identifier for the result that was chosen.
	 * @return
	 */
	public String GetResultId()
	{
		return result_id;
	}
	
	/**
	 * Set the unique identifier for the result that was chosen.
	 * @param result_id
	 */
	public void SetResultId(String result_id)
	{
		this.result_id = result_id;
	}
}
