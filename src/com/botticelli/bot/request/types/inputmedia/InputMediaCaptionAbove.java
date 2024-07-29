package com.botticelli.bot.request.types.inputmedia;

import java.io.File;

public abstract class InputMediaCaptionAbove extends InputMedia{

    private boolean show_caption_above_media;
    private boolean has_spoiler;

    public InputMediaCaptionAbove(String type, String media) {
        super(type, media);
    }

    public InputMediaCaptionAbove(String type, File media) {
        super(type, media);
    }

    public boolean isShow_caption_above_media() {
        return show_caption_above_media;
    }

    public void setShow_caption_above_media(boolean show_caption_above_media) {
        this.show_caption_above_media = show_caption_above_media;
    }

    public boolean hasSpoiler() {
        return has_spoiler;
    }

    public void setHas_spoiler(boolean has_spoiler) {
        this.has_spoiler = has_spoiler;
    }
}
