package com.botticelli.bot.request.types;
/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Audio extends Voice{


	private String performer;
	private String title;
	
	/**
	 * Optional. Performer of the audio as defined by sender or by audio tags
	 * @return
	 */
	public String getPerformer()
	{
		return performer;
	}

	/**
	 * Optional. Set the performer of the audio as defined by sender or by audio tags
	 * @param performer
	 */
	public void setPerformer(String performer)
	{
		this.performer = performer;
	}
	
	/**
	 * Optional. Title of the audio as defined by sender or by audio tags
	 * @return
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * Optional. Set the title of the audio as defined by sender or by audio tags
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
}
