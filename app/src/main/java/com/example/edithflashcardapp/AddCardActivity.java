package com.example.edithflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        findViewById(R.id.flashcard_cancel_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.flashcard_save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (findViewById(R.id.flashcard_typed_question)).setVisibility(View.INVISIBLE);
                (findViewById(R.id.flashcard_typed_answer)).setVisibility(View.VISIBLE);
                ((EditText) findViewById(R.id.flashcard_typed_question)).getText().toString();
                ((EditText) findViewById(R.id.flashcard_typed_answer)).getText().toString();
                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("string1", ""); // puts one string into the Intent, with the key as 'string1'

                Intent intent = new Intent(AddCardActivity.this, AddCardActivity.class);
                AddCardActivity.this.startActivity(intent);

                data.putExtra("string2", ""); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity

            }
        });
    }}