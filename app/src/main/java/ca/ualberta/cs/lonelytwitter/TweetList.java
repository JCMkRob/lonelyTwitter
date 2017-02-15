package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by joshuarobertson on 2017-02-14.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet (Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }
}
