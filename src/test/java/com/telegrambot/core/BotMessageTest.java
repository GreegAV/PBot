package com.telegrambot.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class BotMessageTest {

    @Test
    public void send() {
        new BotMessage(221816696, "Hi again, Bot!").send();
    }
}