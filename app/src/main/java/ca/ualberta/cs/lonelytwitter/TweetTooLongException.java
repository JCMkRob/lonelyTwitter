package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jcrobert on 1/17/17.
 *
 * The Tweet is too long.
 */
public class TweetTooLongException extends Exception {
    public TweetTooLongException() {
    }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
