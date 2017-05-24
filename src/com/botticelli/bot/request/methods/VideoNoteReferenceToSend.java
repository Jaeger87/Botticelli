package com.botticelli.bot.request.methods;

import java.util.Map;

public class VideoNoteReferenceToSend extends AbstractReplyManageToSend{

	private String video_note;
	private int duration;
	private int length;
	
	public VideoNoteReferenceToSend(long chat_id, String video_note) 
	{
		super(chat_id);
		// TODO Auto-generated constructor stub
	}
	
	public VideoNoteReferenceToSend(String channelusername, String video_note) 
	{
		super(channelusername);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("video_note", video_note);
		map.put("duration", duration);
		map.put("length", length);
		return map;
	}

	public int getDuration() 
	{
		return duration;
	}

	public void setDuration(int duration) 
	{
		this.duration = duration;
	}

	public int getLength() 
	{
		return length;
	}

	public void setLength(int length) 
	{
		this.length = length;
	}
	
	
	
}
