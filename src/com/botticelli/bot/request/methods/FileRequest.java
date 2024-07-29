package com.botticelli.bot.request.methods;

import java.io.File;

public interface FileRequest extends Request, FormDataFileContainer{

	/**
	 * Get the File
	 * @return
	 */
	public default FormDataFileContainer[] getFormDataPartsContainers()
	{
		return new FormDataFileContainer[]{this};
	}

	/**
	 * It returns the type of the file (don't touch!!)
	 * @return
	 */
	public String getFormDataParameterName();
}
