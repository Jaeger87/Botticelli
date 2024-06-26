package com.botticelli.bot.request.methods;

public class SendMediaGroup extends AbstractToSend{

    private int message_thread_id;

    public SendMediaGroup(long chat_id) {
        super(chat_id);
    }

    public SendMediaGroup(String channelusername) {
        super(channelusername);
    }
}
