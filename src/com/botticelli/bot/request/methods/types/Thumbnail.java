package com.botticelli.bot.request.methods.types;

import com.botticelli.bot.request.methods.FormDataFileContainer;

import java.io.File;

public class Thumbnail implements FormDataFileContainer {

    private transient File thumbnailFile;
    private String thumbnail;

    public Thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Thumbnail(File thumbnailFile) {
        if(thumbnailFile == null)
            return;
        this.thumbnailFile = thumbnailFile;
        this.thumbnail = "attach://" + thumbnailFile.getName();
    }

    @Override
    public File getFile() {
        return thumbnailFile;
    }

    @Override
    public String getFormDataParameterName() {
        return thumbnailFile.getName();
    }
}
