package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class AboutUs extends AppCompatActivity {
    ImageSlider missionSlider, visionSlider;
    ArrayList<SlideModel> imgMission = new ArrayList<>();
    CardView directorView1, directorView2, directorView3;
    TextView appbarPresident, appbarDirector, appbarFounder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        missionSlider = findViewById(R.id.missionSlider);
        visionSlider = findViewById(R.id.visionSlider);
        directorView1 = findViewById(R.id.directorDetails1);
        directorView2 = findViewById(R.id.directorDetails2);
        directorView3 = findViewById(R.id.directorDetails3);
        appbarPresident = findViewById(R.id.positionPresident);
        appbarDirector = findViewById(R.id.positionDirector);
        appbarFounder = findViewById(R.id.positionFounder);


        // app toolbar

        Toolbar toolbar = findViewById(R.id.aboutToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



//        card view director activity
        directorView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUs.this, DirectorDetails.class);
                intent.putExtra("appbarName",appbarPresident.getText().toString());
                startActivity(intent);
            }
        });
        directorView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUs.this, DirectorDetails.class);
                intent.putExtra("appbarName",appbarDirector.getText().toString());
                startActivity(intent);
            }
        });
        directorView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUs.this, DirectorDetails.class);
                intent.putExtra("appbarName",appbarFounder.getText().toString());
                startActivity(intent);
            }
        });






//        slider image

        imgMission.add(new SlideModel(R.drawable.mission1, ScaleTypes.CENTER_CROP));
        imgMission.add(new SlideModel(R.drawable.mission2,ScaleTypes.CENTER_CROP));
        imgMission.add(new SlideModel(R.drawable.mission3,ScaleTypes.CENTER_CROP));

        missionSlider.setImageList(imgMission);
        visionSlider.setImageList(imgMission);

    }
}