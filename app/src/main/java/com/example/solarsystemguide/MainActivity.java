package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    TODO create a view for every planet
//    TODO create a details view for every planet
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
        mercuryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMercuryMenu();
            }
        });
        venusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toVenusMenu();
            }
        });
        earthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toEarthMenu();
            }
        });
        marsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMarsMenu();
            }
        });
        jupiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toJupiterMenu();
            }
        });
        saturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSaturnMenu();
            }
        });
    }

    public void toSunMenu() {
        Intent intent = new Intent(this, SunMenu.class);
        startActivity(intent);
    }

    public void toMercuryMenu() {
        Intent intent = new Intent(this, MercuryMenu.class);
        startActivity(intent);
    }

    public void toVenusMenu() {
        Intent intent = new Intent(this, VenusMenu.class);
        startActivity(intent);
    }

    public void toEarthMenu() {
        Intent intent = new Intent(this, EarthMenu.class);
        startActivity(intent);
    }

    public void toMarsMenu() {
        Intent intent = new Intent(this, MarsMenu.class);
        startActivity(intent);
    }

    public void toJupiterMenu() {
        Intent intent = new Intent(this, JupiterMenu.class);
        startActivity(intent);
    }

    public void toSaturnMenu() {
        Intent intent = new Intent(this, SaturnMenu.class);
        startActivity(intent);
    }

}