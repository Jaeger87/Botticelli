package com.botticelli.bot.request.methods.types;

import com.google.gson.Gson;

public class GsonOwner {
	
	private static GsonOwner mySelf;
	private Gson gson;
	
	private GsonOwner()
	{
		gson = new Gson();
	}
	
	public static GsonOwner getInstance()
	{
		if(mySelf == null)
			mySelf = new GsonOwner();
		return mySelf;
	}

	public Gson getGson()
	{
		return gson;
	}
}
