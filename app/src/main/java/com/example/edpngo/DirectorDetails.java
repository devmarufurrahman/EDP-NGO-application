package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DirectorDetails extends AppCompatActivity {

    TextView name, desc, email, address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_director_details);
        name = findViewById(R.id.directorDetailsName);
        email = findViewById(R.id.directorDetailsEmail);
        desc = findViewById(R.id.directorDetailsDesc);
        address = findViewById(R.id.directorDetailsAddress);

        // get intent
        Intent intent = getIntent();
        String appbarName = intent.getStringExtra("appbarName");
        String intentName = intent.getStringExtra("name");
        String intentEmail = intent.getStringExtra("email");
        String intentDesc = intent.getStringExtra("desc");
        String intentAddress = intent.getStringExtra("address");

        // toolbar activity
        Toolbar toolbar = findViewById(R.id.directorToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(appbarName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        // set intent
        name.setText(intentName);
        email.setText(intentEmail);
        desc.setText(intentDesc);
        address.setText(intentAddress);
    }
}