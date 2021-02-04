package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VenusResearchMissions extends AppCompatActivity {

    Button pastMissionsButton, ongoingMissionsButton;
    Fragment pastVenusMissions, ongoingVenusMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus_research_missions);

        pastMissionsButton = findViewById(R.id.endedMissionsVenusButton);
        pastMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEndedMissionsClick();
            }
        });

        ongoingMissionsButton = findViewById(R.id.ongoingMissionsVenusButton);
        ongoingMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOngoingMissionsClick();
            }
        });




        pastVenusMissions = new Fragment(R.layout.fragment_ended_research_venus_missions);
    }

    public void onEndedMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsVenusMissions, pastVenusMissions);
        transaction.commit();
    }

    public void onOngoingMissionsClick(){
    }

}