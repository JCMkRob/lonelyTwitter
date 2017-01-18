package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jcrobert on 1/17/17.
 */

import java.util.Date;
import java.util.ArrayList;

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

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public void addMood(Mood mood) {
        this.moodArrayList.add(mood);
    }
}
