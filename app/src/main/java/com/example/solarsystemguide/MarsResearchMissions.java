package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MarsResearchMissions extends AppCompatActivity {

    Button pastMissionsButton, ongoingMissionsButton;
    Fragment pastMarsMissions, ongoingMarsMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars_research_missions);



        pastMissionsButton = findViewById(R.id.endedMissionsMarsButton);
        pastMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEndedMissionsClick();
            }
        });

        ongoingMissionsButton = findViewById(R.id.ongoingMissionsMarsButton);
        ongoingMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOngoingMissionsClick();
            }
        });




        pastMarsMissions = new Fragment(R.layout.fragment_ended_research_mars_missions);
        ongoingMarsMissions = new Fragment(R.layout.fragment_ongoing_research_mars_missions);
    }



    public void onEndedMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsMarsMissions, pastMarsMissions);
        transaction.commit();
    }

    public void onOngoingMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsMarsMissions, ongoingMarsMissions);
        transaction.commit();
    }


}