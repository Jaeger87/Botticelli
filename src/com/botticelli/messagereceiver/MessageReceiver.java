package com.botticelli.messagereceiver;



import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import com.botticelli.bot.Bot;
import com.botticelli.bot.request.methods.UpdateRequest;
import com.botticelli.bot.request.methods.types.Update;

/**
 * This object download updates for your bot and for every message call the Bot class method manage message
 * This object can spawn threads to work messages, so if you don't want to manage parallelism build
 * the object with threads set to 1, otherwise please set the threads to a number greater than 1.
 * You can set the time 
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class MessageReceiver {

	private Bot bot;
	
	private UpdateRequest ur;
	
	private int millis;
	private ExecutorService pool;
	private boolean stop = false;
	private boolean ignoreEditedMessages = false;
	/**
	 * 
	 * @param bot  Your bot.
	 * @param millis Time in millis to wait between one update request and the next.
	 * @param threads Active threads in the threadpool.
	 * @throws IllegalArgumentException
	 */
	public MessageReceiver(Bot bot,int millis, int threads) throws IllegalArgumentException
	{
		setup(bot, millis, threads);
	}

	/**
	 * 
	 * @param bot Your bot.
	 * @param millis Time in millis to wait between one update request and the next.
	 * @param threads Active threads in the threadpool.
	 * @param ur If you want "no standard" update request, than pass your values by this object
	 * @throws IllegalArgumentException
	 */
	public MessageReceiver(Bot bot,int millis, int threads,  UpdateRequest ur) throws IllegalArgumentException
	{
		setup(bot, millis, threads);
		if(ur != null)
		    this.ur = ur;	
	}
	
	private void setup(Bot bot, int millis, int threads) throws IllegalArgumentException
	{
		if(millis < 0)
			throw new IllegalArgumentException("Time can't rewind...");
		if(bot == null)
			throw new IllegalArgumentException("bot was null...");
		if(threads < 1)
			pool = Executors.newFixedThreadPool(1);
		else
			pool = Executors.newFixedThreadPool(threads);
		this.millis = millis;
		this.bot = bot;
		this.ur = new UpdateRequest();
		ur.setTimeout(3);
	}
	
	
	public void ignoreOldMessages()
	{
		this.ur.setOffset(-1);
	}
	
	public void ignoreEditedMessages()
	{
		ignoreEditedMessages = true;
	}
	
	/**
	 * In this method there is a while (true) loop cycle on which every amount of milliseconds
	 * updates are downloaded and worked.
	 */
	public void start() 
	{
		while(!stop)
		{
			List<Update> updates = bot.getUpdates(ur);
			if(updates != null)
				for (Update u : updates) 
				{
					ur.setOffset(u.getUpdateID() + 1);
		
					HandleMessageThread hmt = new HandleMessageThread(bot, u, ignoreEditedMessages);
					if(hmt != null)
					    pool.submit(hmt);
				}
			try 
			{
				TimeUnit.MILLISECONDS.sleep(millis);
			} 
			catch (InterruptedException e) 
			{
				Bot.getErrorLogger().log(Level.SEVERE, "sleep error", e);
				e.printStackTrace();
			}
		}
		stop = false;
	}
	
	/**
	 * This method stop the bot execution
	 */
	public void stopExecution()
	{
		stop = true;
	}
}


