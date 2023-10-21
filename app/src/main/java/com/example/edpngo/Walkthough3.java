package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Walkthough3 extends AppCompatActivity {

    TextView skipWalk3;
    ImageView nextWalk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthough3);
        skipWalk3 = findViewById(R.id.skipWalkThough3);
        nextWalk3 = findViewById(R.id.nextWalkThough3);


        // skip walk though
        skipWalk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walkthough3.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



        // next walk though
        nextWalk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walkthough3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}