package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class DonatePaypal extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_paypal);
        toolbar = findViewById(R.id.donatePaypalToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Donate Paypal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}