package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class ProjectDetails extends AppCompatActivity {

    String title, description;
    ImageView imgIv;
    TextView titleTv, descTv;
    ShapeableImageView shapeableImageView;
    int image = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);
        imgIv = findViewById(R.id.projectDetailImg);
        titleTv = findViewById(R.id.projectDetailTitle);
        descTv = findViewById(R.id.projectDetailDesc);
        shapeableImageView = findViewById(R.id.courseEnrollImg);

        // Toolbar

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Project Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent = getIntent();
        image = intent.getIntExtra("img",image);
        title = intent.getStringExtra("title");
        description = intent.getStringExtra("desc");


        imgIv.setImageResource(image);
        titleTv.setText(title);
        descTv.setText(description);

        shapeableImageView.setImageResource(image);

    }
}