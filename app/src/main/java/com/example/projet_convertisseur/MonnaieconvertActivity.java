package com.example.projet_convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MonnaieconvertActivity extends AppCompatActivity  {

    Button valider;
    EditText montant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monnaieconvert);

        montant = findViewById(R.id.saisirmontant);
        valider = findViewById(R.id.button_valider);
        Spinner spinnerdepart = findViewById(R.id.monnaiedepart_spinner);
        Spinner spinnerarrivee = findViewById(R.id.monnaiearrivee_spinner);

        String[] from = {"USD $","EUR €","GBP £","YEN ¥"};
        String[] to = {"YEN ¥","USD $","EUR €","GBP £","MAD د.م."};
        ArrayAdapter adapterdepart = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        ArrayAdapter adapterarrivee = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);

        spinnerdepart.setAdapter(adapterdepart);
        spinnerarrivee.setAdapter(adapterarrivee);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double montantsaisie ;
                Double valeur ;
                montantsaisie = Double.parseDouble(montant.getText().toString());

                getPreferences(MODE_PRIVATE)
                        .edit()
                        .putString("monnaie",montantsaisie.toString())
                        .apply();

                if(spinnerdepart.getSelectedItem().toString() == "USD $" && spinnerarrivee.getSelectedItem().toString() == "EUR €"){
                    valeur = (montantsaisie * 0.829) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " € ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "USD $" && spinnerarrivee.getSelectedItem().toString() == "YEN ¥"){
                    valeur = (montantsaisie * 106.82) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " ¥ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "USD $" && spinnerarrivee.getSelectedItem().toString() == "USD $"){
                    valeur = (montantsaisie) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " $ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "USD $" && spinnerarrivee.getSelectedItem().toString() == "GBP £"){
                    valeur = (montantsaisie * 0.71485) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " £ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "USD $" && spinnerarrivee.getSelectedItem().toString() == "MAD د.م."){
                    valeur = (montantsaisie * 8.94084) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " .د.م ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "EUR €" && spinnerarrivee.getSelectedItem().toString() == "EUR €"){
                    valeur = (montantsaisie) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " € ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "EUR €" && spinnerarrivee.getSelectedItem().toString() == "YEN ¥"){
                    valeur = (montantsaisie * 128.69) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " ¥ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "EUR €" && spinnerarrivee.getSelectedItem().toString() == "USD $"){
                    valeur = (montantsaisie * 1.20485) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " $ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "EUR €" && spinnerarrivee.getSelectedItem().toString() == "GBP £"){
                    valeur = (montantsaisie * 0.86526) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " £ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "EUR €" && spinnerarrivee.getSelectedItem().toString() == "MAD د.م."){
                    valeur = (montantsaisie * 10.7877) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " .د.م ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "GBP £" && spinnerarrivee.getSelectedItem().toString() == "EUR €"){
                    valeur = (montantsaisie * 1.1557) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " € ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "GBP £" && spinnerarrivee.getSelectedItem().toString() == "YEN ¥"){
                    valeur = (montantsaisie * 148.73) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " ¥ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "GBP £" && spinnerarrivee.getSelectedItem().toString() == "USD $"){
                    valeur = (montantsaisie * 1.3922) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " $ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "GBP £" && spinnerarrivee.getSelectedItem().toString() == "GBP £"){
                    valeur = (montantsaisie) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " £ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "GBP £" && spinnerarrivee.getSelectedItem().toString() == "MAD د.م."){
                    valeur = (montantsaisie * 12.45129) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " .د.م ",Toast.LENGTH_LONG).show();
                }
                if(spinnerdepart.getSelectedItem().toString() == "YEN ¥" && spinnerarrivee.getSelectedItem().toString() == "EUR €"){
                    valeur = (montantsaisie * 0.00777) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " € ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "YEN ¥" && spinnerarrivee.getSelectedItem().toString() == "YEN ¥"){
                    valeur = (montantsaisie) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " ¥ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "YEN ¥" && spinnerarrivee.getSelectedItem().toString() == "USD $"){
                    valeur = (montantsaisie * 0.00936) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " $ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "YEN ¥" && spinnerarrivee.getSelectedItem().toString() == "GBP £"){
                    valeur = (montantsaisie * 0.00672) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " £ ",Toast.LENGTH_LONG).show();
                }

                else if(spinnerdepart.getSelectedItem().toString() == "YEN ¥" && spinnerarrivee.getSelectedItem().toString() == "MAD د.م."){
                    valeur = (montantsaisie * 0.08366) ;
                    Toast.makeText(getApplicationContext(),valeur.toString() + " .د.م ",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}