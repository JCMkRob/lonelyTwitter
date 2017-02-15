package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

import java.util.ArrayList;

/**
 * Created by joshuarobertson on 2017-02-14.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class); //WHY
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("another test tweet");

        tweets.add(tweet);

        Tweet returnTweet = tweets.getTweet(0);

        assertEquals(returnTweet.getMessage(), tweet.getMessage());
        assertEquals(returnTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testStrings() {
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }


    public void testDoubleAdd() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        try {
            tweets.add(tweet);
            Assert.fail("Should throw exception for duplicate entry.");
        }
        catch (IllegalArgumentException e){}
    }

    public void testGetTweetList() {
        TweetList tweets = new TweetList();

        Tweet tweet_0 = new NormalTweet("tweet one");
        Tweet tweet_1 = new NormalTweet("tweet two");
        Tweet tweet_2 = new NormalTweet("tweet three");
        Tweet tweet_3 = new NormalTweet("tweet four");

        tweets.add(tweet_0);
        tweets.add(tweet_1);
        tweets.add(tweet_2);
        tweets.add(tweet_3);

        ArrayList<Tweet> testList = tweets.getTweets();

        assertEquals(testList.get(0), tweet_0);
        assertEquals(testList.get(1), tweet_1);
        assertEquals(testList.get(2), tweet_2);
        assertEquals(testList.get(3), tweet_3);
    }

    public void testFakeContains() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("another test tweet");

        tweets.add(tweet);

        Tweet fake  = new NormalTweet("test tweet");
        fake.setDate(tweet.getDate());

        assertFalse(tweets.hasTweet(fake));
    }

    public void countTweets() {
        TweetList tweets = new TweetList();

        Tweet tweet_0 = new NormalTweet("tweet one");
        Tweet tweet_1 = new NormalTweet("tweet two");
        Tweet tweet_2 = new NormalTweet("tweet three");
        Tweet tweet_3 = new NormalTweet("tweet four");

        assertEquals(0, tweets.getCount());
        tweets.add(tweet_0);
        assertEquals(1, tweets.getCount());
        tweets.add(tweet_1);
        assertEquals(2, tweets.getCount());
        tweets.add(tweet_2);
        assertEquals(3, tweets.getCount());
        tweets.add(tweet_3);
        assertEquals(4, tweets.getCount());
        tweets.delete(tweet_3);
        assertEquals(3, tweets.getCount());
        tweets.delete(tweet_0);
        assertEquals(2, tweets.getCount());
        tweets.delete(tweet_2);
        assertEquals(1, tweets.getCount());
        tweets.delete(tweet_1);
        assertEquals(0, tweets.getCount());
    }
}
