package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UranusMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreUranusInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranus_menu);

        learnMoreUranusInfo = findViewById(R.id.buttonLearnMoreUranusInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreSolarMissions);

        learnMoreUranusInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toUranusDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toUranusMissions();
            }
        });
    }


    public void toUranusDetails(){
        Intent intent = new Intent(this, UranusDetails.class);
        startActivity(intent);
    }

    public void toUranusMissions(){
        Intent intent = new Intent(this, UranusResearchMissions.class);
        startActivity(intent);
    }
}