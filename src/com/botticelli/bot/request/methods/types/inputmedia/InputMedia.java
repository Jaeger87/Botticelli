package com.botticelli.bot.request.methods.types.inputmedia;

import java.io.File;

public abstract class InputMedia {

    public final String type;
    public String caption;
    public String media;

    public InputMedia(String type) {
        this.type = type;
    }

    public InputMedia(String type, String media) {
        this.type = type;
    }

    public InputMedia(String type, File media) {
        this.type = type;
    }
}
