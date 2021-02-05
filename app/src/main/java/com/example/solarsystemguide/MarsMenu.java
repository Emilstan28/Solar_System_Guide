package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MarsMenu extends AppCompatActivity {

    Button learnMoreMissions, learnMoreMarsInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars_menu);

        learnMoreMarsInfo = findViewById(R.id.buttonLearnMoreMarsInformation);
        learnMoreMissions = findViewById(R.id.buttonLearnMoreMartianMissions);

        learnMoreMarsInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMarsDetails();
            }
        });

        learnMoreMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMarsMissions();
            }
        });
    }

    public void toMarsDetails(){
        Intent intent = new Intent(this, MarsDetails.class);
        startActivity(intent);
    }

    public void toMarsMissions(){
    }
}