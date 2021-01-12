package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SunMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_menu);

        Button learnMoreSunInfo = findViewById(R.id.buttonLearnMoreSunInformation);

        learnMoreSunInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSunDetails();
            }
        });
    }


    public void toSunDetails(){
        Intent intent = new Intent(this, SunDetails.class);
        startActivity(intent);
    }

}