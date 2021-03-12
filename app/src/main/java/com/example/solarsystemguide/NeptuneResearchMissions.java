package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class NeptuneResearchMissions extends AppCompatActivity {

    Fragment pastNeptuneMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neptune_research_missions);

        pastNeptuneMissions = new Fragment(R.layout.fragment_ended_research_neptune_missions);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsNeptuneMissions, pastNeptuneMissions);
        transaction.commit();
    }
}