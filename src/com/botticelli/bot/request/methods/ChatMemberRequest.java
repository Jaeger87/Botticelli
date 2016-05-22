package com.botticelli.bot.request.methods;

public class ChatMemberRequest extends KickChatMemberRequest{

	public ChatMemberRequest(long chat_id, long user_id) 
	{
		super(chat_id, user_id);
	}

	public ChatMemberRequest(String channelusername, long user_id) 
	{
		super(channelusername, user_id);
	}

}
