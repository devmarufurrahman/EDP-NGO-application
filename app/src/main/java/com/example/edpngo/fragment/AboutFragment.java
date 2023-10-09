package com.example.edpngo.fragment;

import android.os.Bundle;

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


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about, container, false);

        missionSlider = view.findViewById(R.id.missionSlider);
        visionSlider = view.findViewById(R.id.visionSlider);


        imgMission.add(new SlideModel(R.drawable.mission1,ScaleTypes.CENTER_CROP));
        imgMission.add(new SlideModel(R.drawable.mission2,ScaleTypes.CENTER_CROP));
        imgMission.add(new SlideModel(R.drawable.mission3,ScaleTypes.CENTER_CROP));



        missionSlider.setImageList(imgMission);
        visionSlider.setImageList(imgMission);


        // Inflate the layout for this fragment
        return view;
    }
}