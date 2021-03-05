package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaturnMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreSaturnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturn_menu);

        learnMoreSaturnInfo = findViewById(R.id.buttonLearnMoreSaturnInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreMartianMissions);

        learnMoreSaturnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSaturnDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSaturnMissions();
            }
        });
    }



    public void toSaturnDetails(){
        Intent intent = new Intent(this, SaturnDetails.class);
        startActivity(intent);
    }

    public void toSaturnMissions(){
        Intent intent = new Intent(this, SaturnResearchMissions.class);
        startActivity(intent);
    }
}