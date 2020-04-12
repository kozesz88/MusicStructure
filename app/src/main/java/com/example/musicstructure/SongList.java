package com.example.musicstructure;

public class SongList {
    //creating to string
    private String mArtist;

    private String mTitle;

    // calling the SongList, and using the artist and the title from there
    public SongList(String artist, String title) {
        mArtist = artist;
        mTitle = title;
    }
    public String getartist() {
        return mArtist;
    }

    public String gettitle() {
        return mTitle;
    }

}