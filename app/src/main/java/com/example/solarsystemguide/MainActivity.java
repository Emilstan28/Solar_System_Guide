package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    TODO create the main menu in this shit
//    TODO create a view for every planet
//    TODO learn about databases
    Button sunButton, mercuryButton, venusButton, earthButton, marsButton,
        jupiterButton, saturnButton, uranusButton, neptuneButton, dwarfsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sunButton = findViewById(R.id.sunButton);
        mercuryButton = findViewById(R.id.mercuryButton);
        venusButton = findViewById(R.id.venusButton);
        earthButton = findViewById(R.id.earthButton);
        marsButton = findViewById(R.id.marsButton);
        jupiterButton = findViewById(R.id.jupiterButton);
        saturnButton = findViewById(R.id.saturnButton);
        uranusButton = findViewById(R.id.uranusButton);
        neptuneButton = findViewById(R.id.neptuneButton);
        dwarfsButton = findViewById(R.id.dwarfsButton);


        sunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSunMenu();
            }
        });
    }

    public void toSunMenu() {
        Intent intent = new Intent(this, SunMenu.class);
        startActivity(intent);
    }


}