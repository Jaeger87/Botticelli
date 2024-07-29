package com.botticelli.bot.request.methods;

import java.io.File;

public interface FormDataFileContainer {

    /**
     * Get the File
     * @return
     */
    public File getFile();

    /**
     * It returns the type of the file (don't touch!!)
     * @return
     */
    public String getFormDataParameterName();
}
