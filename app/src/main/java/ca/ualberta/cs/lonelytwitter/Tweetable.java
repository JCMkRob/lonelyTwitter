package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jcrobert on 1/17/17.
 */

import java.util.Date;

/**
 * Interface for objects that will be able to be sent as tweets.
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
