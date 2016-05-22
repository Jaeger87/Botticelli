package com.botticelli.bot.request.methods.types;

public enum MessageEntityType {
	mention("mention"), hashtag("hashtag"), bot_command("bot_command"), url("url"),
	email("email"), bold("bold"), italic("italic"), code("code"), pre("pre"),
	text_link("text_link"), text_mention("text_mention");
	
	private String str;
	/**
	 * Builder
	 * @param str
	 */
	MessageEntityType(String str)
	{
		this.str=str;
	}
	/**
	 * Returns the appropriate string
	 */
	public String toString()
	{
		return str;
	}

}
