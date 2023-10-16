package com.example.edpngo.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.edpngo.R;


public class BlogFragment extends Fragment {
    Button eventBtn1, eventBtn2, eventBtn3, eventBtn4;
    public BlogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blog, container, false);
        eventBtn1 = view.findViewById(R.id.eventBtn1);
        eventBtn2 = view.findViewById(R.id.eventBtn2);
        eventBtn3 = view.findViewById(R.id.eventBtn3);
        eventBtn4 = view.findViewById(R.id.eventBtn4);



        // event Btn1 activity
        eventBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new DonateFragment());
                fragmentTransaction.commit();
            }
        });


        // event Btn2 activity
        eventBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new DonateFragment());
                fragmentTransaction.commit();
            }
        });


        // event Btn3 activity
        eventBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new DonateFragment());
                fragmentTransaction.commit();
            }
        });

        // event Btn4 activity
        eventBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new DonateFragment());
                fragmentTransaction.commit();
            }
        });


        return view;
    }
}