package com.example.musicstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<SongList> {
    //creating a new adapter
    public SongListAdapter(Context context, ArrayList<SongList> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        SongList currentSong = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        titleTextView.setText(currentSong.gettitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentSong.getartist());

        return listItemView;
    }
}