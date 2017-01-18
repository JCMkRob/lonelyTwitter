package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jcrobert on 1/17/17.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    public NormalTweet(String message) {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
