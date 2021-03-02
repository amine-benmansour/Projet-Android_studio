package com.example.projet_convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView temperature;
    private ImageView distance;
    private ImageView monnaie;
    private Button buttonopenurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonopenurl = findViewById(R.id.voirplus);

        buttonopenurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSiteConvertion();
            }
        });


        this.temperature = findViewById(R.id.Temperature);

        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent temperatureActivity = new Intent(getApplicationContext(),TemperatureconvertActivity.class);
                startActivity(temperatureActivity);

            }
        });

        this.distance = findViewById(R.id.Distance);

        distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent distanceActivity = new Intent(getApplicationContext(),DistanceconvertActivity.class);
                startActivity(distanceActivity);
            }
        });


        this.monnaie = findViewById(R.id.Monnaie);

        monnaie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monnaieActivity = new Intent(getApplicationContext(),MonnaieconvertActivity.class);
                startActivity(monnaieActivity);
            }
        });
    }

    public void openSiteConvertion() {
        String url = "https://convertlive.com/fr/convert" ;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }
}