package com.botticelli.bot.request.methods;

import java.util.Map;

import com.botticelli.bot.request.types.ParseMode;
/**
 * This object clusters all the data need for the method sendMessage
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class MessageToSend extends AbstractReplyManageToSend {

	private String text;
	private boolean disable_web_page_preview;
	private ParseMode parse_mode;

	public MessageToSend(long chat_id, String text) 
	{
		super(chat_id);
		if (text == null)
			text = "";
		else
			this.text = text;
	}
	
	
	public MessageToSend(String channelusername, String text) 
	{
		super(channelusername);
		if (text == null)
			text = "";
		else
			this.text = text;
	}
	
	/**
	 * Set Disables link previews for links in this message
	 * @param disable_web_page_preview
	 */
	public void setDisableWebPagePreview(boolean disable_web_page_preview) 
	{
		this.disable_web_page_preview = disable_web_page_preview;
	}

	/**
	 * Text of the message to be sent
	 * @return
	 */
	public String Gettext()
	{
		return text;
	}
	
	/**
	 * Disables link previews for links in this message
	 * @return
	 */
	public boolean getDisableWebPagePreview()
	{
		return disable_web_page_preview;
	}
	
	public void setParseMode(ParseMode parse_mode)
	{
		this.parse_mode = parse_mode;
	}
	
	public ParseMode getParseMode()
	{
		return parse_mode;
	}
	
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("text", text);
		map.put("parse_mode", parse_mode);
		return map;
	}
	
	@Override
	public String toString()
	{	
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
	
	

}
