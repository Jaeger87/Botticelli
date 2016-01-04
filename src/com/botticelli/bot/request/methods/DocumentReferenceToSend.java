package com.botticelli.bot.request.methods;

import java.util.Map;
/**
 * This object clusters all the data need for the method send Document 
 * (in this case the Document is a telegram file_id)
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class DocumentReferenceToSend extends AbstractReplyManageToSend{

	private String document;
	
	public DocumentReferenceToSend(long chat_id, String document) {
		super(chat_id);
		this.document = document;
	}
	
	
	public DocumentReferenceToSend(String channelusername, String document) {
		super(channelusername);
		this.document = document;
	}
	/**
	 * Get the file_id of the File
	 * @return
	 */
	public String getDocument()
	{
		return document;
	}

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("document", document);
		return map;
	}
	
	public String toString()
	{
		return QueryStringBuilder.createToQueryString(getValuesMap());
	}
}
