package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VenusMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreVenusInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus_menu);

        learnMoreVenusInfo = findViewById(R.id.buttonLearnMoreVenusInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreVenusianMissions);

        learnMoreVenusInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toVenusDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toVenusMissions();
            }
        });
    }


    public void toVenusDetails(){
        Intent intent = new Intent(this, VenusDetails.class);
        startActivity(intent);
    }

    public void toVenusMissions(){
        Intent intent = new Intent(this, VenusResearchMissions.class);
        startActivity(intent);
    }

}