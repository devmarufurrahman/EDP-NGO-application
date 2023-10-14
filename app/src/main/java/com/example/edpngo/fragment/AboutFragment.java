package com.example.edpngo.fragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.edpngo.R;

import java.util.ArrayList;


public class AboutFragment extends Fragment {

    ImageSlider missionSlider, visionSlider;
    ArrayList<SlideModel> imgMission = new ArrayList<>();
    CardView directorView1, directorView2, directorView3;


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about, container, false);
        missionSlider = view.findViewById(R.id.missionSlider);
        visionSlider = view.findViewById(R.id.visionSlider);
        directorView1 = view.findViewById(R.id.directorDetails1);
        directorView2 = view.findViewById(R.id.directorDetails2);
        directorView3 = view.findViewById(R.id.directorDetails3);


//        card view director activity
        directorView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        directorView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        directorView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


//        slider image

        imgMission.add(new SlideModel(R.drawable.mission1,ScaleTypes.CENTER_CROP));
        imgMission.add(new SlideModel(R.drawable.mission2,ScaleTypes.CENTER_CROP));
        imgMission.add(new SlideModel(R.drawable.mission3,ScaleTypes.CENTER_CROP));

        missionSlider.setImageList(imgMission);
        visionSlider.setImageList(imgMission);


        // Inflate the layout for this fragment
        return view;
    }
}