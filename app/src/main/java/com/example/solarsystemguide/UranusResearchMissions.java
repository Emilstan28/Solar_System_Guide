package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class UranusResearchMissions extends AppCompatActivity {

    Fragment pastUranusMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranus_research_missions);

        pastUranusMissions = new Fragment(R.layout.fragment_ended_research_uranus_missions);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsUranusMissions, pastUranusMissions);
        transaction.commit();
    }
}