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
	private boolean ignoreEditedMessages;
	
	public HandleMessageThread(Bot bot, Update u, boolean ignoreEditedMessages) 
	{
		this.update = u;
		this.bot = bot;
		this.ignoreEditedMessages = ignoreEditedMessages;
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
			bot.callback_query(update.getCallback_query());
		if(!ignoreEditedMessages && update.isEditedMessageUpdate())
			bot.manageMessage(update.getEdited_message());
	}

}
