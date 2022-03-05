package com.example.edithflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //move the answer text view to be at the same location as the question text view
        //set the visibility of the answer text view to be invisible so it doesn't block the question text
        //set an onClickListener for the question text view that will hide the question text view and show the answer text view
        findViewById(R.id.flashcard_question_textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.flashcard_question_textview)).setVisibility(View.INVISIBLE);
                ((TextView) findViewById(R.id.flashcard_answer_textview)).setVisibility(View.VISIBLE);
            }
        });
    }
}