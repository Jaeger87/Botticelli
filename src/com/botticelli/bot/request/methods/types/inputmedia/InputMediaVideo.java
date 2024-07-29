package com.botticelli.bot.request.methods.types.inputmedia;

import com.botticelli.bot.request.methods.types.Thumbnail;
import com.google.gson.annotations.JsonAdapter;

import java.io.File;

public class InputMediaVideo extends InputMediaCaptionAbove{

    //@JsonAdapter(DatiTypeAdapter.class)
    private Thumbnail thumbnail;
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
        return thumbnail.getFile();
    }

    public void setThumbnailFile(Thumbnail thumbnail) {
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

    @Override
    public boolean hasThumbnail() {
        return thumbnail != null;
    }
}
