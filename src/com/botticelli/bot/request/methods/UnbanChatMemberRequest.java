package com.botticelli.bot.request.methods;

public class UnbanChatMemberRequest extends KickChatMemberRequest{

	public UnbanChatMemberRequest(long chat_id, long user_id) 
	{
		super(chat_id, user_id);
	}

	public UnbanChatMemberRequest(String channelusername, long user_id) 
	{
		super(channelusername, user_id);
	}

}
