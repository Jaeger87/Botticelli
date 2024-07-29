package com.botticelli.bot.request.types.inputmedia;

import java.io.File;

public class InputMediaVideo extends InputMediaCaptionAbove{

    private transient File thumbnailFile;
    private String thumbnail;
    private Integer width;
    private Integer height;
    private Integer duration;
    private boolean supports_streaming;


    public InputMediaVideo(String media) {
        super("video", media);
    }

    public InputMediaVideo(File media) {
        super("video", media);
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

    public boolean isSupports_streaming() {
        return supports_streaming;
    }

    public void setSupports_streaming(boolean supports_streaming) {
        this.supports_streaming = supports_streaming;
    }

    @Override
    public boolean hasThumbnail() {
        return thumbnail != null;
    }
}
