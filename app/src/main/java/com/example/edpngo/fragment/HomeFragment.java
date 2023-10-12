package com.example.edpngo.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.edpngo.ContactActivity;
import com.example.edpngo.DonatePaypal;
import com.example.edpngo.ProjectDetails;
import com.example.edpngo.R;


public class HomeFragment extends Fragment {

    TextView seeAllTv;
    Button featureBtn1, featureBtn2, featureBtn3, eventBtn1, eventBtn2, eventBtn3, viewProfile;
    LinearLayout donateLayout, aboutLayout, contactLayout;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        seeAllTv = view.findViewById(R.id.seeAllProjects);
        featureBtn1 = view.findViewById(R.id.featureProjectBtn1);
        featureBtn2 = view.findViewById(R.id.featureProjectBtn2);
        featureBtn3 = view.findViewById(R.id.featureProjectBtn3);
        donateLayout = view.findViewById(R.id.donateActivityLayout);
        aboutLayout = view.findViewById(R.id.aboutActivityLayout);
        contactLayout = view.findViewById(R.id.contactActivityLayout);
        eventBtn1 = view.findViewById(R.id.eventBtn1);
        eventBtn2 = view.findViewById(R.id.eventBtn2);
        eventBtn3 = view.findViewById(R.id.eventBtn3);
        viewProfile = view.findViewById(R.id.viewProfileBtn);



        // view profile
        viewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new ProfileFragment());
                fragmentTransaction.commit();
            }
        });


        // see all project
        seeAllTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new ProjectFragment());
                fragmentTransaction.commit();
            }
        });


        // feature project 1
        featureBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.festival_project);
                intent.putExtra("title",getString(R.string.festival_program));
                intent.putExtra("desc",getString(R.string.festival_desc));
                startActivity(intent);
            }
        });


        // feature project 2
        featureBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.computer_project);
                intent.putExtra("title",getString(R.string.computer_courses));
                intent.putExtra("desc",getString(R.string.computer_desc));
                startActivity(intent);
            }
        });


        // feature project 3
        featureBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.health_aid_project);
                intent.putExtra("title",getString(R.string.home_health_aide));
                intent.putExtra("desc",getString(R.string.health_desc));
                startActivity(intent);
            }
        });



        // donate layout activity
        donateLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DonatePaypal.class);
                startActivity(intent);
            }
        });


        // donate layout activity
        contactLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ContactActivity.class);
                startActivity(intent);
            }
        });


        // about layout activity
        aboutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new AboutFragment());
                fragmentTransaction.commit();
            }

        });




        // event Btn1 activity
        eventBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DonatePaypal.class);
                startActivity(intent);
            }
        });


        // event Btn2 activity
        eventBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DonatePaypal.class);
                startActivity(intent);
            }
        });


        // event Btn3 activity
        eventBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DonatePaypal.class);
                startActivity(intent);
            }
        });



        return view;
    }
}