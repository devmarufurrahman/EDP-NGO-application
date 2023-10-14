package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

public class DirectorDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_director_details);

        // get intent
        Intent intent = getIntent();
        String appbarName = intent.getStringExtra("appbarName");

        // toolbar activity
        Toolbar toolbar = findViewById(R.id.directorToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(appbarName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}