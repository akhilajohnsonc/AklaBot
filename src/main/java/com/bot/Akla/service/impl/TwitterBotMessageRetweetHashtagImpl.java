package com.bot.Akla.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bot.Akla.service.TwitterBotMessageRetweetHashtag;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

@Service
public class TwitterBotMessageRetweetHashtagImpl implements TwitterBotMessageRetweetHashtag {
	@Autowired
	private Twitter twitter;

	@Override
	public void reTweetHashtag() {

		// Search for tweets with a specific hashtag
		String hashtag = "#100daysofcode";
		Query query = new Query(hashtag);
		QueryResult result;
		try {
			result = twitter.search(query);
			List<Status> tweets = result.getTweets();
			for (Status tweet : tweets) {
				// Retweet each tweet
				if (!tweet.getText().toLowerCase().contains("essays")
						&& !tweet.getText().toLowerCase().contains("bigdata")
						&& !tweet.getText().toLowerCase().contains("homework")
						&& (tweet.getText().toLowerCase().contains("learn")
								|| tweet.getText().toLowerCase().contains("solved")
								|| tweet.getText().toLowerCase().contains("finished")
								|| tweet.getText().toLowerCase().contains("create")
								|| tweet.getText().toLowerCase().contains("develop")
								|| tweet.getText().toLowerCase().contains("revise")
								|| tweet.getText().toLowerCase().contains("start"))) {
					twitter.retweetStatus(tweet.getId());
					System.out.println("Retweeted: " + tweet.getText());
					
				}

			}
		} catch (TwitterException e) {
			e.printStackTrace();
		}

	}

}
