package com.botticelli.bot.request.methods;

import com.botticelli.bot.request.methods.types.GsonOwner;
import com.botticelli.bot.request.methods.types.inputmedia.InputMedia;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MediaGroupToSend<T extends InputMedia> extends AbstractToSend{

    private String business_connection_id;
    private int message_thread_id;
    private List<T> media;
    private boolean disable_notification;
    private boolean protect_content;
    private String message_effect_id;

    public MediaGroupToSend(long chat_id, List<T> media) {
        super(chat_id);
        this.media = media;
    }

    public MediaGroupToSend(String channelusername, List<T> media) {
        super(channelusername);
        this.media = media;
    }

    @Override
    public Map<String, Object> getValuesMap()
    {
        Map<String, Object> map = super.getValuesMap();
        map.put("business_connection_id", business_connection_id);
        map.put("message_thread_id", message_thread_id);
        map.put("media", GsonOwner.getInstance().getGson().toJson(media));
        map.put("disable_notification", disable_notification);
        map.put("protect_content", protect_content);
        map.put("message_effect_id", message_effect_id);
        return map;
    }

    public List<File> getMediaFiles()
    {
        List<File> returnList = new ArrayList<File>();
        for (T inputmedia : media)
        {
            if(inputmedia.isInputMediaFile())
                returnList.add(inputmedia.getMediaFile());
            if(inputmedia.hasThumbnail())
                returnList.add(inputmedia.getThumbnailFile());
        }
        return returnList;
    }

    public String getBusiness_connection_id() {
        return business_connection_id;
    }

    public void setBusiness_connection_id(String business_connection_id) {
        this.business_connection_id = business_connection_id;
    }

    public int getMessage_thread_id() {
        return message_thread_id;
    }

    public void setMessage_thread_id(int message_thread_id) {
        this.message_thread_id = message_thread_id;
    }

    public boolean isDisable_notification() {
        return disable_notification;
    }

    public void setDisable_notification(boolean disable_notification) {
        this.disable_notification = disable_notification;
    }

    public boolean isProtect_content() {
        return protect_content;
    }

    public void setProtect_content(boolean protect_content) {
        this.protect_content = protect_content;
    }

    public String getMessage_effect_id() {
        return message_effect_id;
    }

    public void setMessage_effect_id(String message_effect_id) {
        this.message_effect_id = message_effect_id;
    }
}
