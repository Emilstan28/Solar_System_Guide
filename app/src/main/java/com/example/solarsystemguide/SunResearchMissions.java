package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SunResearchMissions extends AppCompatActivity {

    Button pastMissionsButton, ongoingMissionsButton;
    Fragment pastSunMissions, ongoingSunMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_research_missions);

        pastMissionsButton = findViewById(R.id.endedMissionsSunButton);
        pastMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEndedMissionsClick();
            }
        });

        ongoingMissionsButton = findViewById(R.id.ongoingMissionsSunButton);
        ongoingMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOngoingMissionsClick();
            }
        });




        pastSunMissions = new Fragment(R.layout.fragment_past_research_sun_missions);
        ongoingSunMissions = new Fragment(R.layout.fragment_ongoing_research_sun_missions);
    }

    public void onEndedMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsSunMissions, pastSunMissions);
        transaction.commit();
    }

    public void onOngoingMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsSunMissions, ongoingSunMissions);
        transaction.commit();
    }


}