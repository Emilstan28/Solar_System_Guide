package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DwarfsMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreDwarfsInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwarfs_menu);

        learnMoreDwarfsInfo = findViewById(R.id.buttonLearnMoreDwarfsInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreDwarvenMissions);

        learnMoreDwarfsInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toDwarfsDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toDwarfsMissions();
            }
        });
    }


    public void toDwarfsDetails(){
        Intent intent = new Intent(this, DwarfsDetails.class);
        startActivity(intent);
    }

    public void toDwarfsMissions(){
        Intent intent = new Intent(this, DwarfsResearchMissions.class);
        startActivity(intent);
    }
}