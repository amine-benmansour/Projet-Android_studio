package com.example.projet_convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class TemperatureconvertActivity extends AppCompatActivity {

    EditText temperature;
    RadioButton toCelsius;
    RadioButton toFahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatureconvert);
        temperature = (EditText) findViewById(R.id.valeurTemperature);
        toCelsius = (RadioButton) findViewById(R.id.Celsiusbitton);
        toFahrenheit = (RadioButton) findViewById(R.id.Farenheitbutton);
    }

    public static float celsiusafahrenheit(float celsius){
        return ((celsius*1.8f)+32);
    }

    public static float fahrenheitacelsius(float fahrenheit){
        return ((fahrenheit-32)/1.8f);
    }

    public void conversion(View v){
        float valeur = new Float(temperature.getText().toString());
        if(toCelsius.isChecked()){
            valeur = fahrenheitacelsius(valeur);
        }
        else{
            valeur = celsiusafahrenheit(valeur);
        }
        temperature.setText(new Float(valeur).toString());

    }
}