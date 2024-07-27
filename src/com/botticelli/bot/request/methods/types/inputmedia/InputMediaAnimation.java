package com.botticelli.bot.request.methods.types.inputmedia;

import java.io.File;

public class InputMediaAnimation extends InputMediaCaptionAbove{

    private transient File thumbnailFile;
    private String thumbnail;
    private int width;
    private int height;
    private int duration;

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
}
