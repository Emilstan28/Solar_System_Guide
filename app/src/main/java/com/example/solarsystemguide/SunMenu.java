package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SunMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreSunInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_menu);

        learnMoreSunInfo = findViewById(R.id.buttonLearnMoreSunInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreSolarMissions);

        learnMoreSunInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSunDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSunMissions();
            }
        });
    }


    public void toSunDetails(){
        Intent intent = new Intent(this, SunDetails.class);
        startActivity(intent);
    }

    public void toSunMissions(){
        Intent intent = new Intent(this, SunResearchMissions.class);
        startActivity(intent);
    }

}