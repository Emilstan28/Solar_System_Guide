package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NeptuneMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreNeptuneInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neptune_menu);

        learnMoreNeptuneInfo = findViewById(R.id.buttonLearnMoreNeptuneInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreNeptunianMissions);

        learnMoreNeptuneInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toNeptuneDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toNeptuneMissions();
            }
        });
    }

    public void toNeptuneDetails(){
        Intent intent = new Intent(this, NeptuneDetails.class);
        startActivity(intent);
    }

    public void toNeptuneMissions(){
        Intent intent = new Intent(this, NeptuneResearchMissions.class);
        startActivity(intent);
    }
}