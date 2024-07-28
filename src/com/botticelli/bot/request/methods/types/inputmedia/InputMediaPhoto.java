package com.botticelli.bot.request.methods.types.inputmedia;

import java.io.File;

public class InputMediaPhoto extends InputMediaCaptionAbove{

    public InputMediaPhoto(String media) {
        super("photo", media);
    }

    public InputMediaPhoto(File media) {
        super("photo", media);
    }

    public File getThumbnailFile() {
        return null;
    }

    @Override
    public boolean hasThumbnail() {
        return false;
    }
}
