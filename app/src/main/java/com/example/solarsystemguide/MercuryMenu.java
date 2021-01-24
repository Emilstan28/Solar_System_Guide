package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MercuryMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreMercuryInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_menu);

        learnMoreMercuryInfo = findViewById(R.id.buttonLearnMoreMercuryInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreMercurialMissions);

        learnMoreMercuryInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMercuryDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMercuryMissions();
            }
        });
    }


    public void toMercuryDetails(){
        Intent intent = new Intent(this, MercuryDetails.class);
        startActivity(intent);
    }

    public void toMercuryMissions(){
    }

}