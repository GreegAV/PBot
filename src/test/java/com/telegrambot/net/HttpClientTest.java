package com.telegrambot.net;

import com.telegrambot.core.BotMessage;
import org.junit.Test;

public class HttpClientTest {

    @Test
    public void POST() {
        HttpClient.POST(
                "https://api.telegram.org/bot792816294:AAE9A2Trrnp6Mm8qFqRkGmYqdNXX-xprrB0/sendMessage",
                new BotMessage(221816696, "Hi there again, Bot!")
        );
    }
}