package com.botticelli.bot.request.methods.types.inputmedia;

import java.io.File;

public class InputMediaDocument extends InputMedia{

    private boolean disable_content_type_detection;

    public InputMediaDocument(String type, String media) {
        super("document", media);
    }

    public InputMediaDocument(String type, File media) {
        super("document", media);
    }

    public boolean isDisable_content_type_detection() {
        return disable_content_type_detection;
    }

    /**
     * Disables automatic server-side content type detection for files uploaded using multipart/form-data. Always True, if the document is sent as part of an album.
     * @param disable_content_type_detection
     */
    public void setDisable_content_type_detection(boolean disable_content_type_detection) {
        this.disable_content_type_detection = disable_content_type_detection;
    }
}
