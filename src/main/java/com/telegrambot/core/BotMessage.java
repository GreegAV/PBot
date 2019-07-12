package com.telegrambot.core;

import com.telegrambot.net.HttpClient;

public class BotMessage {
    private final int chat_id;
    private final String text;
    private static final String TELEGRAM_RESOURCE = "https://api.telegram.org/bot792816294:AAE9A2Trrnp6Mm8qFqRkGmYqdNXX-xprrB0";

    public BotMessage(int chat_id, String text) {
        this.chat_id = chat_id;
        this.text = text;
    }

    public int getChat_id() {
        return chat_id;
    }

    public String getText() {
        return text;
    }

    public void send() {
        HttpClient.POST(TELEGRAM_RESOURCE + "/sendMessage", this);
    }
}
