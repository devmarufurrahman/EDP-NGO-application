package com.example.edpngo.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.edpngo.DonatePaypal;
import com.example.edpngo.R;

public class ProfileFragment extends Fragment {

    TextView profileName, profilePhone, profileMail, donationTitle;
    Button profileDonateBtn;
    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        profileName = view.findViewById(R.id.profileName);
        profilePhone = view.findViewById(R.id.profilePhone);
        profileMail = view.findViewById(R.id.profileMail);
        donationTitle = view.findViewById(R.id.donationTitle);
        profileDonateBtn = view.findViewById(R.id.profileDonateBtn);

        profileDonateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DonatePaypal.class);
                startActivity(intent);
            }
        });
        getParentFragmentManager().setFragmentResultListener("dataBundle", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String name = result.getString("name");
                String mail = result.getString("mail");
                String phone = result.getString("phone");
                String goalsTitle = result.getString("goalsTitle");

                profileName.setText(name);
                profileMail.setText(mail);
                profilePhone.setText(phone);
                donationTitle.setText(goalsTitle);
            }
        });


        return view;
    }
}