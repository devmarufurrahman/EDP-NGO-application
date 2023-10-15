package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ProjectDetails extends AppCompatActivity {

    String title, description;
    ImageView imgIv;
    TextView titleTv, descTv;
    ShapeableImageView shapeableImageView, shapeableImageView2, shapeableImageView3;
    Button enrollBtn1, enrollBtn2, enrollBtn3;
    ArrayList<Button> enrollBtn = new ArrayList<>();
    int image = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);
        imgIv = findViewById(R.id.projectDetailImg);
        titleTv = findViewById(R.id.projectDetailTitle);
        descTv = findViewById(R.id.projectDetailDesc);
        shapeableImageView = findViewById(R.id.courseEnrollImg);
        shapeableImageView2 = findViewById(R.id.courseEnrollImg2);
        shapeableImageView3 = findViewById(R.id.courseEnrollImg3);


        // Toolbar
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Project Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        // get intent
        Intent intent = getIntent();
        image = intent.getIntExtra("img",image);
        title = intent.getStringExtra("title");
        description = intent.getStringExtra("desc");

        // set intent
        imgIv.setImageResource(image);
        titleTv.setText(title);
        descTv.setText(description);
        shapeableImageView.setImageResource(image);
        shapeableImageView2.setImageResource(image);
        shapeableImageView3.setImageResource(image);


        // enroll btn array add
        enrollBtn.add(enrollBtn1 = findViewById(R.id.enrollBtn1));
        enrollBtn.add(enrollBtn2 = findViewById(R.id.enrollBtn2));
        enrollBtn.add(enrollBtn3 = findViewById(R.id.enrollBtn3));
        for (int i = 0; i< enrollBtn.size(); i++){
            if (enrollBtn.get(i).equals(enrollBtn1)){
                loadIntent(enrollBtn1);
            } else if (enrollBtn.get(i).equals(enrollBtn2)) {
                loadIntent(enrollBtn2);
            } else {
                loadIntent(enrollBtn3);
            }
        }
    }


    private void loadIntent(Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectDetails.this, EnrollForm.class);
                startActivity(intent);
            }
        });
    }
}