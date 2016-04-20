package com.botticelli.messagereceiver;

import com.botticelli.bot.Bot;
import com.botticelli.bot.request.methods.types.Update;
/**
 * This thread read the message values and passes them on to the appropriate method.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class HandleMessageThread implements Runnable
{
	
	private Bot bot;
	private Update update;
	
	public HandleMessageThread(Bot bot, Update u) 
	{
		this.update = u;
		this.bot = bot;
	}
	
	@Override
	public void run() 
	{
		if(update.isMessageUpdate())
		    bot.manageMessage(update.getMessage());
		if(update.isInlineQueryUpdate())
			bot.inLineQuery(update.getInlineQuery());
		if(update.isCheckInlineResultUpdate())
			bot.chose_inline_result(update.getChosenInlineResult());
		if(update.isCallbackUpdate())
			update.getCallback_query();
	}

}
