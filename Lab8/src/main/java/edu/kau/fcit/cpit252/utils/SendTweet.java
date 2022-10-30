package edu.kau.fcit.cpit252.utils;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class SendTweet {

    static final String CONSUMER_KEY = "you-key";
    static final String CONSUMER_SECRET = "secret";
    static final String ACCESS_TOKEN = "token";
    static final String ACCESS_TOKEN_SECRET = "token-secret";

    private static Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);

        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }

    public static void postTweet(String tweet) throws TwitterException {
        Status status = getTwitterInstance().updateStatus(tweet);
        System.out.println("Successfully posted [" + status.getText() + "].");
    }
}
