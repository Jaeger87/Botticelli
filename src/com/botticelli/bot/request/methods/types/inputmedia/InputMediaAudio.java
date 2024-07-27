package com.botticelli.bot.request.methods.types.inputmedia;

import java.io.File;

public class InputMediaAudio extends InputMedia{

    private transient File thumbnailFile;
    private String thumbnail;
    private int duration;
    private String performer;
    private String title;

    public InputMediaAudio(String type, String media) {
        super("audio", media);
    }

    public InputMediaAudio(String type, File media) {
        super("audio", media);
    }

    public File getThumbnailFile() {
        return thumbnailFile;
    }

    public void setThumbnailFile(File thumbnailFile) {
        this.thumbnailFile = thumbnailFile;
        thumbnail = "attach://" + thumbnailFile.getName();
    }

    public int getDuration() {
        return duration;
    }

    /**
     * Duration of the audio in seconds
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Title of the audio
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerformer() {
        return performer;
    }

    /**
     *  Performer of the audio
     * @param performer
     */
    public void setPerformer(String performer) {
        this.performer = performer;
    }
}
