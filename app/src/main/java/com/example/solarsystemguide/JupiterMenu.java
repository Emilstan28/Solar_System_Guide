package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JupiterMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreJupiterInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jupiter_menu);


        learnMoreJupiterInfo = findViewById(R.id.buttonLearnMoreJupiterInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreJovianMissions);

        learnMoreJupiterInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toJupiterDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toJupiterMissions();
            }
        });
    }



    public void toJupiterDetails(){
        Intent intent = new Intent(this, JupiterDetails.class);
        startActivity(intent);
    }

    public void toJupiterMissions(){
        Intent intent = new Intent(this, JupiterResearchMissions.class);
        startActivity(intent);
    }
}