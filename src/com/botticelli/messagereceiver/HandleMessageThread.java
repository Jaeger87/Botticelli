package com.botticelli.messagereceiver;

import com.botticelli.bot.Bot;
import com.botticelli.bot.request.methods.types.Message;
/**
 * This thread read the message values and passes them on to the appropriate method.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class HandleMessageThread implements Runnable
{
	private Message message;
	private Bot bot;
	
	public HandleMessageThread(Bot bot, Message message) 
	{
		this.message = message;
		this.bot = bot;
	}
	
	@Override
	public void run() 
	{
		bot.manageMessage(message);
	}

}
