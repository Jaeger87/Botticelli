package com.botticelli.bot.request.methods.types;

public enum DocumentMimeType {

	PDF,ZIP;
	
	
	@Override
	public String toString()
	{
		if(this == DocumentMimeType.PDF)
			return "application/pdf";
		return "application/zip";
	}
}
