package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Walkthough2 extends AppCompatActivity {

    TextView skipWalk2;
    ImageView nextWalk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthough2);
        skipWalk2 = findViewById(R.id.skipWalkThough2);
        nextWalk2 = findViewById(R.id.nextWalkThough2);


        // skip walk though
        skipWalk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walkthough2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



        // next walk though
        nextWalk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walkthough2.this, Walkthough3.class);
                startActivity(intent);
                finish();
            }
        });

    }
}