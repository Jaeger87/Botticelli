package com.botticelli.bot.request.methods;

import com.botticelli.bot.request.methods.types.RandomEmojis;

import java.util.Map;

public class DiceToSend extends AbstractReplyManageToSend{


    private RandomEmojis emoji;

    public DiceToSend(long chat_id, RandomEmojis emoji) {
        super(chat_id);
        this.emoji = emoji;
    }


    public DiceToSend(String channelusername, RandomEmojis emoji)
    {
        super(channelusername);
        this.emoji = emoji;
    }


    public Map<String, Object> getValuesMap()
    {
        Map<String, Object> map = super.getValuesMap();
        map.put("emoji", emoji.toString());
        return map;
    }

}
