package com.bot.Akla.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bot.Akla.service.TwitterBotMessageRetweetHashtag;
import com.bot.Akla.service.TwitterBotReadLines;

@RestController
public class BotContoller {

	Logger logger = LogManager.getLogger(BotContoller.class);
	@Autowired
	TwitterBotReadLines readLines;

	@Autowired
	TwitterBotMessageRetweetHashtag reTweetHashtag;

	@GetMapping(value = "/startApp")
	public Boolean startApp() {
		
		logger.info("Application has been started");
		// Tweet after reading the file
		readLines.readTweet();
		// Search for tweets with a specific hashtag
//		reTweetHashtag.reTweetHashtag();
//		logger.info("ReTweeting: ...");
		return true;
	}
}
