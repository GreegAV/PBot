package com.telegrambot.core;

public class BotMessage {
    private final int cat_id;
    private final String text;

    public BotMessage(int cat_id, String text) {
        this.cat_id = cat_id;
        this.text = text;
    }

    public int getCat_id() {
        return cat_id;
    }

    public String getText() {
        return text;
    }

    public void send(){

    }
}
