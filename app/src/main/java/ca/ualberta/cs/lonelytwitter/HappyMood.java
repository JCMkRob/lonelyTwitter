package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jcrobert on 1/17/17.
 */

/**
 * This class allows for tweets to have a mood, expressed by the method.
 * @see #Mood
 */
public class HappyMood extends Mood {

    /**
     * expresses the objects mood.
     *
     * @return the mood of the object.
     */
    public String format() {
        return "HAPPY!";
    }
}
