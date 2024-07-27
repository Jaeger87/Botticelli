package com.botticelli.bot.request.methods.types.inputmedia;

import java.io.File;

public class InputMediaVideo extends InputMediaCaptionAbove{

    private File thumbnail;
    private int width;
    private int height;
    private int duration;
    private boolean supports_streaming;


    public InputMediaVideo(String media) {
        super("video", media);
    }

    public InputMediaVideo(File media) {
        super("video", media);
    }

    public File getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(File thumbnail) {
        this.thumbnail = thumbnail;
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
}
