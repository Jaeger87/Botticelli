package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Map;

public class VideoNoteFileToSend extends AbstractReplyManageToSend implements FileRequest{

	private File video_note;
	private int duration;
	private int length;
	
	public VideoNoteFileToSend(long chat_id, File video_note) 
	{
		super(chat_id);
	}
	
	public VideoNoteFileToSend(String channelusername, File video_note) 
	{
		super(channelusername);
		this.video_note = video_note;
	}

	@Override
	public File getFormDataPartsContainers()
	{
		return video_note;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "video_note";
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("duration", duration);
		map.put("length", length);
		return map;
	}
}
