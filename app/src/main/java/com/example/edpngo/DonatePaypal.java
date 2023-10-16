package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class DonatePaypal extends AppCompatActivity implements View.OnClickListener {
Toolbar toolbar;
CardView donateDollarCard1, donateDollarCard2, donateDollarCard3, donateDollarCard4;
TextView usd100, usd500, usd1000, usdOthers;
ArrayList<CardView> cardList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_paypal);
        cardList.add(donateDollarCard1 = findViewById(R.id.donateDollarCard1));
        cardList.add(donateDollarCard2 = findViewById(R.id.donateDollarCard2));
        cardList.add(donateDollarCard3 = findViewById(R.id.donateDollarCard3));
        cardList.add(donateDollarCard4 = findViewById(R.id.donateDollarCard4));
        usd100 = findViewById(R.id.usd100);
        usd500 = findViewById(R.id.usd500);
        usd1000 = findViewById(R.id.usd1000);
        usdOthers = findViewById(R.id.usdOthers);


        donateDollarCard1.setOnClickListener(this);
        donateDollarCard2.setOnClickListener(this);
        donateDollarCard3.setOnClickListener(this);
        donateDollarCard4.setOnClickListener(this);


        //toolbar
        toolbar = findViewById(R.id.donatePaypalToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Donate Paypal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



        // Card clickable
//        for (int i = 0; i< cardList.size(); i++) {
//            if (cardList.get(i).equals(donateDollarCard1)) {
//                cardClick(donateDollarCard1, usd100);
//            } else if (cardList.get(i).equals(donateDollarCard2)) {
//                cardClick(donateDollarCard2, usd500);
//            } else if (cardList.get(i).equals(donateDollarCard3)) {
//                cardClick(donateDollarCard3, usd1000);
//            } else {
//                cardClick(donateDollarCard4, usdOthers);
//            }
//
//
//
//        }

    }

    private void cardClick( CardView cardView, TextView textView){

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    cardView.setCardBackgroundColor(getColor(R.color.paypalColor));
                    textView.setTextColor(getColor(R.color.white));
                }

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.donateDollarCard1){
            cardClick(donateDollarCard1, usd100);

        } else if (id == R.id.donateDollarCard2) {
            cardClick(donateDollarCard2, usd500);
        } else if (id == R.id.donateDollarCard3) {
            cardClick(donateDollarCard3, usd1000);
        } else {
            cardClick(donateDollarCard4, usdOthers);
        }

    }

}