package com.botticelli.bot.request.methods;

import java.util.Map;
/**
 * This object clusters all the data need for the method send Video 
 * (in this case the Video is a telegram file_id)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class VideoReferenceToSend extends AbstractReplyManageToSend{

	private String video;
	
	public VideoReferenceToSend(long chat_id, String video) 
	{
		super(chat_id);
		this.video = video;
	}
	
	public VideoReferenceToSend(String channelusername, String video) 
	{
		super(channelusername);
		this.video = video;
	}
	/**
	 * Video file_id
	 * @return
	 */
	public String getVideo()
	{
		return video;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("video", video);
		return map;
	}
	
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}

}
