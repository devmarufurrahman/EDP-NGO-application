package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Walkthough1 extends AppCompatActivity {

    TextView skipWalk;
    ImageView nextWalk1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthough1);
        skipWalk = findViewById(R.id.skipWalkThough);
        nextWalk1 = findViewById(R.id.nextWalkThough1);


        // skip walk though
        skipWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walkthough1.this,MainActivity.class);
                startActivity(intent);
                finish();
                setUserRecord();
            }
        });



        // next walk though
        nextWalk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walkthough1.this, Walkthough2.class);
                startActivity(intent);
                finish();
                setUserRecord();
            }
        });

    }

    private void setUserRecord() {
        SharedPreferences preferences = getSharedPreferences("EDPNewUser", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("isNewUser","oldUser");
        editor.apply();
    }
}