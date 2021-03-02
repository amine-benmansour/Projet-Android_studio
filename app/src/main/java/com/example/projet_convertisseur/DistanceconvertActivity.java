package com.example.projet_convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DistanceconvertActivity extends AppCompatActivity {
    Button valider;
    EditText distance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distanceconvert);

        valider = findViewById(R.id.valider_longeur);
        distance = findViewById(R.id.textesaisirvaleur);

        Spinner spinnerdepart = findViewById(R.id.long_depart_spinner);
        Spinner spinnerarrivee = findViewById(R.id.long_arrivee_spinner);
        String[] from = {"Kilomètre","Mètre","Centimètre","Milimètre"};
        String[] to = {"Mètre","Kilomètre","Centimètre","Milimètre"};

        ArrayAdapter adapterdepart = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        ArrayAdapter adapterarrivee = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);

        spinnerdepart.setAdapter(adapterdepart);
        spinnerarrivee.setAdapter(adapterarrivee);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valeur;
                Double longueursaisie;
                longueursaisie = Double.parseDouble(distance.getText().toString());

                if(spinnerdepart.getSelectedItem().toString() == "Kilomètre" && spinnerarrivee.getSelectedItem().toString() == "Mètre"){
                    valeur = (longueursaisie*1000);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " m ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Kilomètre" && spinnerarrivee.getSelectedItem().toString() == "Kilomètre"){
                    valeur = (longueursaisie);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " km ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Kilomètre" && spinnerarrivee.getSelectedItem().toString() == "Centimètre"){
                    valeur = (longueursaisie * 100000);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " cm ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Kilomètre" && spinnerarrivee.getSelectedItem().toString() == "Milimètre"){
                    valeur = (longueursaisie * 1000000);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " mm ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Mètre" && spinnerarrivee.getSelectedItem().toString() == "Mètre"){
                    valeur = (longueursaisie);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " m ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Mètre" && spinnerarrivee.getSelectedItem().toString() == "Kilomètre"){
                    valeur = (longueursaisie * 0.001);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " km ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Mètre" && spinnerarrivee.getSelectedItem().toString() == "Centimètre"){
                    valeur = (longueursaisie * 100);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " cm ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Mètre" && spinnerarrivee.getSelectedItem().toString() == "Milimètre"){
                    valeur = (longueursaisie * 1000);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " mm ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Centimètre" && spinnerarrivee.getSelectedItem().toString() == "Mètre"){
                    valeur = (longueursaisie * 0.01);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " m ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Centimètre" && spinnerarrivee.getSelectedItem().toString() == "Kilomètre"){
                    valeur = (longueursaisie * 0.00001);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " km ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Centimètre" && spinnerarrivee.getSelectedItem().toString() == "Centimètre"){
                    valeur = (longueursaisie);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " cm ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Centimètre" && spinnerarrivee.getSelectedItem().toString() == "Milimètre"){
                    valeur = (longueursaisie * 10);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " mm ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Milimètre" && spinnerarrivee.getSelectedItem().toString() == "Mètre"){
                    valeur = (longueursaisie*.001);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " m ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Milimètre" && spinnerarrivee.getSelectedItem().toString() == "Kilomètre"){
                    valeur = (longueursaisie * 0.000001);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " km ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Milimètre" && spinnerarrivee.getSelectedItem().toString() == "Centimètre"){
                    valeur = (longueursaisie * 0.1);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " cm ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "Milimètre" && spinnerarrivee.getSelectedItem().toString() == "Milimètre"){
                    valeur = (longueursaisie);
                    Toast.makeText(getApplicationContext(),valeur.toString() + " mm ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}