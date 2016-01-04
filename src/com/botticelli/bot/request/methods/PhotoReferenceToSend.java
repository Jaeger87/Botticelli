package com.botticelli.bot.request.methods;

import java.util.Map;
/**
 * This object clusters all the data need for the method send Photo 
 * (in this case the Photo is a telegram file_id)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class PhotoReferenceToSend extends PhotoToSend
{
	private String photo;
	
	public PhotoReferenceToSend(long chat_id, String photo) 
	{
		super(chat_id);
		this.photo = photo;
	}
	
	public PhotoReferenceToSend(String channelusername, String photo) 
	{
		super(channelusername);
		this.photo = photo;
	}
	/**
	 * Photo file_id to send
	 * @return
	 */
	public String getPhoto()
	{
		return photo;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("photo", photo);
		return map;
	}
	
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}

}
