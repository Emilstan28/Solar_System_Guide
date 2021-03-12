package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EarthMenu extends AppCompatActivity {

    Button learnMoreEarthInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_menu);



        learnMoreEarthInfo = findViewById(R.id.buttonLearnMoreEarthInformation);



        learnMoreEarthInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toEarthDetails();
            }
        });
    }



    public void toEarthDetails(){
        Intent intent = new Intent(this, EarthDetails.class);
        startActivity(intent);
    }


}