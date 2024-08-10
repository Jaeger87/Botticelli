package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class VideoNoteFileToSend extends AbstractReplyManageToSend implements FileRequest, FormDataFileContainer{

	private File video_note;
	private int duration;
	private int length;
	private int index = 0;
	private final int filesToSend = 1;
	
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
	public File getFile() {
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

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public Iterator<FormDataFileContainer> iterator() {
		index = 0;
		return this;
	}

	@Override
	public boolean hasNext() {
		return index < filesToSend;
	}

	@Override
	public FormDataFileContainer next() {
		if(index == 0)
			return this;
		return null;
	}
}
