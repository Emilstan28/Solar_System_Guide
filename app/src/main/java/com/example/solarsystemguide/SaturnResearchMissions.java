package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class SaturnResearchMissions extends AppCompatActivity {

    Fragment pastSaturnMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturn_research_missions);

        pastSaturnMissions = new Fragment(R.layout.fragment_ended_research_saturn_missions);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsSaturnMissions, pastSaturnMissions);
        transaction.commit();
    }
}