package com.bot.Akla.service;

import org.springframework.stereotype.Component;

@Component
public interface TwitterBotMessageSender {

    void SendMessage(String message);

}