package com.example.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class JokeDisplay extends AppCompatActivity {
    public static String NEW_JOKE = "NEW_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(NEW_JOKE);
        TextView jokeText = (TextView) findViewById(R.id.joke_text);
        jokeText.setText(joke);
    }
}
