package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JupiterResearchMissions extends AppCompatActivity {

    Button pastMissionsButton, ongoingMissionsButton;
    Fragment pastJupiterMissions, ongoingJupiterMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jupiter_research_missions);

        pastMissionsButton = findViewById(R.id.endedMissionsJupiterButton);
        pastMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEndedMissionsClick();
            }
        });

        ongoingMissionsButton = findViewById(R.id.ongoingMissionsJupiterButton);
        ongoingMissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOngoingMissionsClick();
            }
        });




        pastJupiterMissions = new Fragment(R.layout.fragment_ended_research_jupiter_missions);
        ongoingJupiterMissions = new Fragment(R.layout.fragment_ongoing_research_jupiter_missions);
    }


    public void onEndedMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsJupiterMissions, pastJupiterMissions);
        transaction.commit();
    }

    public void onOngoingMissionsClick(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsJupiterMissions, ongoingJupiterMissions);
        transaction.commit();
    }
}