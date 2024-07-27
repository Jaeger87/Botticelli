package com.botticelli.bot.request.methods.types;

/**
 * Type of formatting styles for text messages
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public enum ParseMode
{
	MARKDOWNV2("MarkdownV2 "), HTML("HTML"), MARKDOWN("Markdown");
	
	private String str;
	/**
	 * Builder
	 * @param str
	 */
	ParseMode(String str)
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
