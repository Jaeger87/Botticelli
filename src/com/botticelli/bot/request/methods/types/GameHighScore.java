package com.botticelli.bot.request.methods.types;

public class GameHighScore {

	private int position;
	private User user;
	private int score;
	
	
	public int getPosition() 
	{
		return position;
	}
	
	public void setPosition(int position)
	{
		this.position = position;
	}
	
	public User getUser() 
	{
		return user;
	}
	
	public void setUser(User user) 
	{
		this.user = user;
	}
	
	public int getScore() 
	{
		return score;
	}
	
	public void setScore(int score) 
	{
		this.score = score;
	}
	
	
}
