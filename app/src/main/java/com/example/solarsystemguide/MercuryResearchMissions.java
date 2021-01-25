package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MercuryResearchMissions extends AppCompatActivity {

    Button pastMissionsButton, ongoingMissionsButton;
    Fragment pastMercuryMissions, ongoingMercuryMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercury_research_missions);

        pastMissionsButton = findViewById(R.id.endedMissionsMercuryButton);
        pastMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEndedMissionsClick();
            }
        });

        ongoingMissionsButton = findViewById(R.id.ongoingMissionsMercuryButton);
        ongoingMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOngoingMissionsClick();
            }
        });




        pastMercuryMissions = new Fragment(R.layout.fragment_ended_research_mercury_missions);
        ongoingMercuryMissions = new Fragment(R.layout.fragment_ongoing_research_mercury_missions);
    }

    public void onEndedMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsMercuryMissions, pastMercuryMissions);
        transaction.commit();
    }

    public void onOngoingMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsMercuryMissions, ongoingMercuryMissions);
        transaction.commit();
    }


}