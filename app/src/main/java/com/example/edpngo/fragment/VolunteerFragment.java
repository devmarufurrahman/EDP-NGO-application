package com.example.edpngo.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.edpngo.R;
import com.example.edpngo.VolunteerJoinForm;

import java.util.ArrayList;


public class VolunteerFragment extends Fragment {

    ArrayList<CardView> volunteerId = new ArrayList<>();
    CardView volunteerProfile1,volunteerProfile2,volunteerProfile3,volunteerProfile4,volunteerProfile5,volunteerProfile6;
    TextView volunteerName;
    Button volunteerJoinBtn;

    public VolunteerFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_volunteer, container, false);
        volunteerId.add(volunteerProfile1 = view.findViewById(R.id.volunteerProfile1));
        volunteerId.add( volunteerProfile2 = view.findViewById(R.id.volunteerProfile2));
        volunteerId.add(volunteerProfile3 = view.findViewById(R.id.volunteerProfile3));
        volunteerId.add(volunteerProfile4 = view.findViewById(R.id.volunteerProfile4));
        volunteerId.add(volunteerProfile5 = view.findViewById(R.id.volunteerProfile5));
        volunteerId.add(volunteerProfile6 = view.findViewById(R.id.volunteerProfile6));
        volunteerName = view.findViewById(R.id.volunteerName);
        volunteerJoinBtn = view.findViewById(R.id.volunteerJoinBtn);

        // join us button form
        volunteerJoinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VolunteerJoinForm.class);
                startActivity(intent);
            }
        });


        // volunteer profile view
        String name = volunteerName.getText().toString();
        for (int i = 0; i<volunteerId.size(); i++){
            if (volunteerId.get(i).equals(volunteerProfile1)) {
                intentLoad(name,"01757000000","volunteer@gmail.com","Goals",volunteerProfile1);
            } else if (volunteerId.get(i).equals(volunteerProfile2)) {
                intentLoad(name,"01757000000","volunteer@gmail.com","Goals",volunteerProfile2);
            } else if (volunteerId.get(i).equals(volunteerProfile3)) {
                intentLoad(name,"01757000000","volunteer@gmail.com","Goals",volunteerProfile3);
            } else if (volunteerId.get(i).equals(volunteerProfile4)) {
                intentLoad(name,"01757000000","volunteer@gmail.com","Goals",volunteerProfile4);
            } else if (volunteerId.get(i).equals(volunteerProfile5)) {
                intentLoad(name,"01757000000","volunteer@gmail.com","Goals",volunteerProfile5);
            } else {
                intentLoad(name,"01757000000","volunteer@gmail.com","Goals",volunteerProfile6);
            }
        }

        return view;
    }

    private void intentLoad(String name, String phone, String mail, String goalsTitle, CardView cardView){

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putString("phone",phone);
                bundle.putString("mail",mail);
                bundle.putString("goalsTitle",goalsTitle);
                getParentFragmentManager().setFragmentResult("dataBundle",bundle);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer, new ProfileFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }
}