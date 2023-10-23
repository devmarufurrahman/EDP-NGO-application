package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class FullImageView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image_view);

        ImageView imageView = findViewById(R.id.imgFull);
        int imgId = getIntent().getExtras().getInt("imgId");
        imageView.setImageResource(imgId);
    }
}