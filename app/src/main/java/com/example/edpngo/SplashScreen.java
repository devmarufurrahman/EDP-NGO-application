package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    String isNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent iHome = new Intent(SplashScreen.this,MainActivity.class);
        Intent walkThough = new Intent(SplashScreen.this, Walkthough1.class);
        SharedPreferences preferences = getSharedPreferences("EDPNewUser",MODE_PRIVATE);
        isNewUser = preferences.getString("isNewUser","");

        // splash screen delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                if (isNewUser.equals("oldUser")){
                    startActivity(iHome);
                    finish();
                    Toast.makeText(SplashScreen.this, isNewUser, Toast.LENGTH_SHORT).show();
                } else if(isNewUser.equals("")){
                    startActivity(walkThough);
                    finish();
                    Toast.makeText(SplashScreen.this, isNewUser, Toast.LENGTH_SHORT).show();
                }

            }
        },2000);

    }
}