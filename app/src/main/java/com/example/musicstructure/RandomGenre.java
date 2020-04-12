package com.example.musicstructure;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RandomGenre extends AppCompatActivity {
    //the message what is there in the beginning
    String message = "What do You waiting for?";

    //new string what will display the new message
    public void displayMessage(String message) {
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(String.valueOf(message));
    }

    @Override
    // the onClick method what generate the display
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_genre);
        displayMessage(message);
    }

    // creating a random genre to display
    public void randomGenre(View view) {
        String[] randomGenre = {"Rock", "Funk", "Hip hop", "Country", "Pop", "Blues", "K-pop", "Punk", "House", "Soul"};
        int index = (int) (Math.random() * 10);
        displayMessage("Your random genre is: " + randomGenre[index]);
    }

}
