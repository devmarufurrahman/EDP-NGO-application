package com.example.edpngo.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.edpngo.MainActivity;
import com.example.edpngo.ProjectDetails;
import com.example.edpngo.R;


public class ProjectFragment extends Fragment {

    Button englishBtn, computerBtn, healthBtn, fashionBtn, lawBtn, festivalBtn;

    public ProjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        englishBtn = view.findViewById(R.id.englishEnrollBtn);
        computerBtn = view.findViewById(R.id.computerEnrollBtn);
        healthBtn = view.findViewById(R.id.healthEnrollBtn);
        fashionBtn = view.findViewById(R.id.fashionEnrollBtn);
        lawBtn = view.findViewById(R.id.lawEnrollBtn);
        festivalBtn = view.findViewById(R.id.festivalEnrollBtn);

        englishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.english_project);
                intent.putExtra("title",getString(R.string.esl_english));
                intent.putExtra("desc",getString(R.string.english_desc));
                startActivity(intent);
            }
        });

        computerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.computer_project);
                intent.putExtra("title",getString(R.string.computer_courses));
                intent.putExtra("desc",getString(R.string.computer_desc));
                startActivity(intent);
            }
        });

        healthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.health_aid_project);
                intent.putExtra("title",getString(R.string.home_health_aide));
                intent.putExtra("desc",getString(R.string.health_desc));
                startActivity(intent);
            }
        });

        fashionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.fashion_design_project);
                intent.putExtra("title",getString(R.string.fashion_design_text));
                intent.putExtra("desc",getString(R.string.fashion_desc));
                startActivity(intent);
            }
        });

        lawBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.lawyer_project);
                intent.putExtra("title",getString(R.string.free_immigration_lawyer));
                intent.putExtra("desc",getString(R.string.law_desc));
                startActivity(intent);
            }
        });

        festivalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectDetails.class);
                intent.putExtra("img",R.drawable.festival_project);
                intent.putExtra("title",getString(R.string.festival_program));
                intent.putExtra("desc",getString(R.string.festival_desc));
                startActivity(intent);
            }
        });


        return view;
    }

}