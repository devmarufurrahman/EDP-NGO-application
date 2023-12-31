package com.example.edpngo.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.edpngo.DonatePaypal;
import com.example.edpngo.R;

public class DonateFragment extends Fragment {

    Button donationDonateBtn;

    public DonateFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_donate, container, false);
        donationDonateBtn = view.findViewById(R.id.donationDonateBtn);

        donationDonateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DonatePaypal.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}