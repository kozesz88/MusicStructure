package com.example.musicstructure;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Create a list of songs
        ArrayList<SongList> songs = new ArrayList<SongList>();
        songs.add(new SongList("WHO", "Wash Your Hands"));
        songs.add(new SongList("For Your Parents", "Stay Home!"));
        songs.add(new SongList("Your Dog", "I Miss My Sofa"));
        songs.add(new SongList("Your Government", "Social Distancing Is Cool"));
        songs.add(new SongList("Old Folks", "Don't Go Out If You Sick"));
        songs.add(new SongList("WHO", "You Need Mask"));
        songs.add(new SongList("Your Friends", "Time To Facetime"));
        songs.add(new SongList("Your Favourite Cafe", "Wish We Would Open"));
        songs.add(new SongList("Your Dog", "I Don't Want More Walk"));
        songs.add(new SongList("Your Government", "Only For Essentials"));
        songs.add(new SongList("Your Girlfriend", "Date On Zoom"));
        songs.add(new SongList("WHO", "It IS Going To Pass"));
        songs.add(new SongList("Your Friends", "We Will Meet In The Fall"));
        songs.add(new SongList("Your Suncream", "You Don't Need Me This Summer"));
        songs.add(new SongList("Your Cat", "I Wish You Were At Work"));

        // create a SongListAdapter
        SongListAdapter adapter = new SongListAdapter(this, songs);

        // find the object and the layout
        ListView listView = (ListView) findViewById(R.id.list);

        // the list view will use the adapter
        listView.setAdapter(adapter);
    }
}