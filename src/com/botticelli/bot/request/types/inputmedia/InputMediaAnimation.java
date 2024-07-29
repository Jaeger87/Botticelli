package com.botticelli.bot.request.types.inputmedia;

import java.io.File;

public class InputMediaAnimation extends InputMediaCaptionAbove{

    private transient File thumbnailFile;
    private String thumbnail;
    private Integer width;
    private Integer height;
    private Integer duration;

    public InputMediaAnimation(String media) {
        super("animation", media);
    }

    public InputMediaAnimation(File media) {
        super("animation", media);
    }

    public File getThumbnailFile() {
        return thumbnailFile;
    }

    public void setThumbnailFile(File thumbnailFile) {
        if(thumbnailFile == null)
            return;
        this.thumbnailFile = thumbnailFile;
        thumbnail = "attach://" + thumbnailFile.getName();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean hasThumbnail() {
        return thumbnail != null;
    }
}
