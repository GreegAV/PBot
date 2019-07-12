package com.telegrambot.core;

public class VideoSearchBotApi implements UpdateHandler {

    @Override
    public void onUpdate(Update update) {
        int chatId = update.getMessage().getChat().getId();
        String text = update.getMessage().getText();
        String user = update.getMessage().getChat().getFirst_name();

        new BotMessage(chatId, text + " - " + user).send();

    }
}
