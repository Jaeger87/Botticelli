package com.botticelli.bot.request.methods.types;

import java.util.List;
/**
 * The return for the update request
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ResultUpdate extends Result{

	private List<Update> result;
	
	/**
	 * List of all updates.
	 * @return
	 */
	public List<Update> getResult()
	{
		return result;
	}
}
