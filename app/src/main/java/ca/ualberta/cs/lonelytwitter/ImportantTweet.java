package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by jcrobert on 1/17/17.
 */

/**
 * This class allows for important tweets.
 *
 * isImportant is implemented from Tweet, getMessage is overridden.
 *
 * @throws TweetTooLongException when the tweet message is too long.
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Allows for an object of this class to show if it is important or not.
     * @return TRUE, because this is important.
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * returns the tweet message.
     * @return original message with some extra importance.
     */
    @Override
    public String getMessage() {
        return super.getMessage() + "!!!!!";
    }

    public Date getDate() {
        return null;
    }

}
