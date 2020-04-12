package com.example.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        TextView library = (TextView) findViewById(R.id.library);

        // Set a click listener on that View
        library.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Library}
                Intent libraryIntent = new Intent(MainActivity.this, Library.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        // Find the View that shows the randomgenre category
        final TextView randomgenre = (TextView) findViewById(R.id.random_genre);

        // Set a click listener on that View
        randomgenre.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RandomGenre}
                Intent randomgenreIntent = new Intent(MainActivity.this, RandomGenre.class);

                // Start the new activity
                startActivity(randomgenreIntent);
            }
        });

        // Find the View that shows the recommendation category
        TextView recommendation = (TextView) findViewById(R.id.recommendation);

        // Set a click listener on that View
        recommendation.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Recommendation}
                Intent recommendationIntent = new Intent(MainActivity.this, Recommendation.class);

                // Start the new activity
                startActivity(recommendationIntent);
            }
        });

        // Find the View that shows the about category
        TextView about = (TextView) findViewById(R.id.about);

        // Set a click listener on that View
        about.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link About}
                Intent aboutIntent = new Intent(MainActivity.this, About.class);

                // Start the new activity
                startActivity(aboutIntent);
            }
        });
    }
}
