package com.bot.Akla.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bot.Akla.service.TwitterBotMessageSender;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

@Service
public class TwitterBotMessageSenderImpl implements TwitterBotMessageSender {

    Logger logger = LogManager.getLogger(TwitterBotMessageSenderImpl.class);

    @Autowired
    private Twitter twitter;

    @Override
    public void SendMessage(String message) {
        Status status;
        try {
            status = twitter.updateStatus(message);
            logger.info("Sending Message To Twitter");
            System.out.println(status);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }
}
