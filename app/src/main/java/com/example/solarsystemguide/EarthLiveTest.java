package com.example.solarsystemguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class EarthLiveTest extends AppCompatActivity {

    WebView earthLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_live_test);
        earthLive = (WebView) findViewById(R.id.earthLive);
        earthLive.loadUrl("https://video.ibm.com/channel/iss-hdev-payload");
    }


}