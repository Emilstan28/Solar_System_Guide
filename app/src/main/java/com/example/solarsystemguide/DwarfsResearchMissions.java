package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class DwarfsResearchMissions extends AppCompatActivity {

    Fragment pastDwarfsMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwarfs_research_missions);

        pastDwarfsMissions = new Fragment(R.layout.fragment_ended_research_dwarfs_missions);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameForFragmentsDwarfsMissions, pastDwarfsMissions);
        transaction.commit();
    }
}