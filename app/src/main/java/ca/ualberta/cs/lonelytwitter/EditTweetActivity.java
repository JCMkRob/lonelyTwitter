package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by joshuarobertson on 2017-02-28.
 */

public class EditTweetActivity extends Activity {
    private ListView oldTweetsList;
    private ArrayList<NormalTweet> tweetList = new ArrayList<NormalTweet>();
    private ArrayAdapter<NormalTweet> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        setContentView(R.layout.edit);
        oldTweetsList = (ListView) findViewById(R.id.TweetsList);

        adapter = new ArrayAdapter<NormalTweet>(this, R.layout.list_item, tweetList);
        oldTweetsList.setAdapter(adapter);

        tweetList.add(new NormalTweet(intent.getStringExtra("tweet")));
        adapter.notifyDataSetChanged();
    }
}
