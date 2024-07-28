package com.botticelli.bot.request.methods;

import java.util.Map;

public class AbstractVideoToSend extends AbstractCaption{

    private boolean supports_streaming;
    private Integer duration;
    private Integer width;
    private Integer height;

    public AbstractVideoToSend(long chat_id) {
        super(chat_id);
    }

    public AbstractVideoToSend(String channelusername) {
        super(channelusername);
    }

    public boolean isSupports_streaming() {
        return supports_streaming;
    }

    public void setSupports_streaming(boolean supports_streaming) {
        this.supports_streaming = supports_streaming;
    }

    @Override
    public Map<String, Object> getValuesMap()
    {
        Map<String, Object> map = super.getValuesMap();
        map.put("supports_streaming", supports_streaming);
        map.put("duration", duration);
        map.put("width", width);
        map.put("height", height);
        return map;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
