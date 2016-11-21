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
	private boolean ignoreChannelMessages;
	
	public HandleMessageThread(Bot bot, Update u, boolean ignoreEditedMessages, boolean ignoreChannelMessages) 
	{
		this.update = u;
		this.bot = bot;
		this.ignoreEditedMessages = ignoreEditedMessages;
		this.ignoreChannelMessages = ignoreChannelMessages;
	}
	
	@Override
	public void run() 
	{
		if(update.isMessageUpdate())
		{
		    bot.manageMessage(update.getMessage());
		    return;
		}
		if(update.isInlineQueryUpdate())
		{
			bot.inLineQuery(update.getInlineQuery());
			return;
		}
		if(update.isCheckInlineResultUpdate())
		{
			bot.chose_inline_result(update.getChosenInlineResult());
			return;
		}
		if(update.isCallbackUpdate())
		{
			bot.callback_query(update.getCallback_query());
			return;
		}
		if(!ignoreEditedMessages && update.isEditedMessageUpdate())
		{
			bot.manageMessage(update.getEdited_message());
			return;
		}
		if(!ignoreChannelMessages && update.isChannelPostUpdate())
		{
			bot.manageMessage(update.getChannel_post());
			return;
		}
		
		if(!ignoreChannelMessages && !ignoreEditedMessages && update.isChannelPostUpdate())
		{
			bot.manageMessage(update.getEdited_channel_post());
			return;
		}
		
		
	}

}
