package com.botticelli.bot.request.methods.types;

public class ChatMember {

	private User user;
	
	private MemberStatus status;

	public User getUser() 
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}

	public MemberStatus getStatus() 
	{
		return status;
	}

	public void setStatus(MemberStatus status) 
	{
		this.status = status;
	}

	
	
}
