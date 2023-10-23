package com.example.edpngo.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.edpngo.FullImageView;
import com.example.edpngo.R;
import com.example.edpngo.adapter.GalleryAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class GalleryFragment extends Fragment {

    GridView gridView;
    ArrayList<Integer> imgIds = new ArrayList<>(Arrays.asList(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7
    ));

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        gridView = view.findViewById(R.id.girdView);
        gridView.setAdapter(new GalleryAdapter(imgIds,getActivity()));





        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemPosition = imgIds.get(i);
                showDialogueBox(itemPosition);
            }
        });

        return view;
    }

    private void showDialogueBox(int itemPosition) {
        Dialog dialog = new Dialog(requireActivity());
        dialog.setContentView(R.layout.custom_dialouge_layout);

        // getting custom view
        ImageView dialogImg;
        Button fullViewBtn, closeBtn;



        dialogImg = dialog.findViewById(R.id.dialogImage);
        closeBtn = dialog.findViewById(R.id.closeBtn);
        fullViewBtn = dialog.findViewById(R.id.fullViewBtn);

        dialogImg.setImageResource(itemPosition);

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


        fullViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FullImageView.class);
                intent.putExtra("imgId", itemPosition);
                startActivity(intent);
            }
        });

        dialog.show();
    }
}