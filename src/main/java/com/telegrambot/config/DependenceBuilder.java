package com.telegrambot.config;

import com.telegrambot.core.UpdateHandler;
import com.telegrambot.core.VideoSearchBotApi;
import org.glassfish.jersey.internal.inject.AbstractBinder;

import javax.inject.Singleton;

public class DependenceBuilder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(VideoSearchBotApi.class).to(UpdateHandler.class).in(Singleton.class);
    }
}
