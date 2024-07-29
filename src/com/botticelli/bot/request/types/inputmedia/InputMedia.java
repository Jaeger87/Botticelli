package com.botticelli.bot.request.types.inputmedia;

import com.botticelli.bot.request.types.MessageEntity;
import com.botticelli.bot.request.types.ParseMode;

import java.io.File;
import java.util.List;

public abstract class InputMedia {

    private final String type;

    private transient File mediaFile;
    private String media;
    private String caption;
    private ParseMode parse_mode;
    private List<MessageEntity> caption_entities;


    public InputMedia(String type, String media) {
        this.type = type;
        this.media = media;
    }

    public InputMedia(String type, File media) {
        this.type = type;
        this.mediaFile = media;
        this.media = "attach://" + media.getName();
    }

    public abstract boolean hasThumbnail();
    public abstract File getThumbnailFile();

    public String getMedia() {
        return media;
    }

    public String getType()
    {
        return type;
    }

    public boolean isInputMediaFile()
    {
        return mediaFile != null;
    }

    public File getMediaFile()
    {
        return mediaFile;
    }

    public String getCaption() {
        return caption;
    }

    /**
     * Caption of the document to be sent, 0-1024 characters after entities parsing
     * @param caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public ParseMode getParse_mode() {
        return parse_mode;
    }

    /**
     * Mode for parsing entities in the document caption. See formatting options(https://core.telegram.org/bots/api#formatting-options) for more details.
     * @param parse_mode
     */
    public void setParse_mode(ParseMode parse_mode) {
        this.parse_mode = parse_mode;
    }

    public List<MessageEntity> getCaption_entities()
    {
        return caption_entities;
    }

    /**
     * List of special entities that appear in the caption, which can be specified instead of parse_mode
     * @param caption_entities
     */
    public void setCaption_entities(List<MessageEntity> caption_entities)
    {
        this.caption_entities = caption_entities;
    }

}
