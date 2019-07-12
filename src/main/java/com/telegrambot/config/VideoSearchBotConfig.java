package com.telegrambot.config;

import org.glassfish.jersey.server.ResourceConfig;

public class VideoSearchBotConfig extends ResourceConfig {

    public VideoSearchBotConfig() {
        register(new DependenceBuilder());
        packages(true, "com.telegrambot");
    }
}
