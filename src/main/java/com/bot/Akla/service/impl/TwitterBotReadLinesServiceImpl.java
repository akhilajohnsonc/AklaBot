package com.bot.Akla.service.impl;

import com.bot.Akla.properties.ApplicationProperties;
import com.bot.Akla.service.TwitterBotMessageRetweetHashtag;
import com.bot.Akla.service.TwitterBotMessageSender;
import com.bot.Akla.service.TwitterBotReadLines;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.Charset;

@Service
public class TwitterBotReadLinesServiceImpl implements TwitterBotReadLines{

	Logger logger = LogManager.getLogger(TwitterBotReadLinesServiceImpl.class);

	@Autowired
	ApplicationProperties properties;

	@Autowired
	TwitterBotMessageSender sendTweet;

	@Autowired
	TwitterBotMessageRetweetHashtag reTweetHashtag;

	

	public void readTweet() {
		String line;
		try {
			try (InputStream fis = new ClassPathResource("/tweets.txt").getInputStream();
					InputStreamReader isr = new InputStreamReader(fis, Charset.forName("Cp1252"));
					BufferedReader br = new BufferedReader(isr)) {
				while ((line = br.readLine()) != null) {
					// Deal with the line
					sendTweet.SendMessage(line);
					logger.info("Tweeting: " + line + "...");

					try {
						System.out.println("Sleeping for 30 minutes...");
						logger.info("Sleeping for: " + properties.getTWEET_TIME_FOUR_HOURS());
						Thread.sleep(properties.getTWEET_TIME_FOUR_HOURS());
						// Thread.sleep(properties.getTWEET_TIME_FIVE_MINUTES());// 5 minutes
					} catch (InterruptedException e) {
						logger.error(e);
					}
				}
			}
		} catch (IOException e) {
			logger.error(e);
		}
	}


}
