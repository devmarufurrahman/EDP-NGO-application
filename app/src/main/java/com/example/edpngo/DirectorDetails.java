package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class DirectorDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_director_details);
        Toolbar toolbar = findViewById(R.id.directorToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Director");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}