package com.botticelli.bot.request.methods.types;

import com.botticelli.bot.request.methods.types.replykeyboard.ReplyKeyboard;

/**
 * Upon receiving a message with this object, Telegram clients will display a reply interface to the user 
 * (act as if the user has selected the bot�s message and tapped �Reply'). 
 * This can be extremely useful if you want to create user-friendly step-by-step interfaces
 *  without having to sacrifice privacy mode.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ForceReply extends ReplyKeyboard {

	private boolean force_reply;
	
	public ForceReply() 
	{
		super();
		force_reply = true;
	}
	
	/**
	 * Use this constructor to set immediately selective parameter
	 * @param selective
	 */
	public ForceReply(boolean selective) 
	{
		super(selective);
		force_reply = true;
	}
	/**
	 *  Shows reply interface to the user, 
	 *  as if they manually selected the bot�s message and tapped �Reply'
	 * @return
	 */
	public boolean getForceReply()
	{
		return force_reply;
	}
}
