/*
Copyright (c) $today.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jcrobert on 1/17/17.
 */

/**
 *
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
