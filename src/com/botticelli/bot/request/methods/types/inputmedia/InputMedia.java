package com.botticelli.bot.request.methods.types.inputmedia;

import com.botticelli.bot.request.methods.types.MessageEntity;
import com.botticelli.bot.request.methods.types.ParseMode;

import java.io.File;
import java.util.List;

public abstract class InputMedia {

    private final String type;
    private String mediaReference;
    private File mediaFile;
    private String caption;
    private ParseMode parse_mode;
    private List<MessageEntity> caption_entities;


    public InputMedia(String type, String media) {
        this.type = type;
        this.mediaReference = media;
    }

    public InputMedia(String type, File media) {
        this.type = type;
        this.mediaFile = media;
    }

    public String getType()
    {
        return type;
    }

    public boolean isInputMediaFile()
    {
        return mediaFile != null;
    }

    public String getMediaReference()
    {
        return mediaReference;
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
