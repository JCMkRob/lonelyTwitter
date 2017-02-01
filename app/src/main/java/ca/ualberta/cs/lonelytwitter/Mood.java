package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jcrobert on 1/17/17.
 */

import java.util.Date;

/**
 * Gives tweets the ability to have a mood. This class is used as a template to implement
 * new moods as needed.
 *
 * as of version 1.0 there is only two moods implmented, HappyMood and SadMood
 *
 * A mood knows when it was created, and can return a String representing its mood.
 *
 * @author jcrobert
 * @version 1.0
 * @see SadMood
 * @see HappyMood
 * @since 0.5
 */
public abstract class Mood {
    private Date date;

    public Mood() {
        this.date = new Date();
    }
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String format();
}
