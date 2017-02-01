package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jcrobert on 1/17/17.
 */

import java.util.Date;
import java.util.ArrayList;

/**
 * The type Tweet.
 */
public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<Mood> moodArrayList = new ArrayList<Mood>();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new java.util.Date();
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    /**
     * Add mood.
     *
     * @param mood the mood
     */
    public void addMood(Mood mood) {
        this.moodArrayList.add(mood);
    }
}
