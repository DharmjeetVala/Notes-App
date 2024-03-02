package com.example.notes_application.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.notes_application.R;

public class CreateNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        ImageView imageBack = findViewById(R.id.imageBack);
        imageBack.setOnClickListener((v)->{onBackPressed();});
    }
}