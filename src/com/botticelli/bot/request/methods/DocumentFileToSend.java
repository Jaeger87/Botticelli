package com.botticelli.bot.request.methods;

import java.io.File;
import java.util.Iterator;

/**
 * This object clusters all the data need for the method sendDocument
 * Bots can currently send files of any type of up to 50 MB in size, 
 * this limit may be changed in the future.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class DocumentFileToSend extends AbstractCaption implements FileRequest, FormDataFileContainer{

	private File document;
	private int index = 0;
	private final int filesToSend = 1;
	
	public DocumentFileToSend(long chat_id, File document) {
		super(chat_id);
		this.document = document;
	}

	public DocumentFileToSend(String channelusername, File document) {
		super(channelusername);
		this.document = document;
	}
	/**
	 * File to send.
	 * Bots can currently send files of any type of up to 50 MB in size, 
	 * this limit may be changed in the future.
	 * @return
	 */
	public File getDocument()
	{
		return document;
	}

	@Override
	public File getFile() {
		return document;
	}

	@Override
	public String getFormDataParameterName()
	{
		return "document";
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
