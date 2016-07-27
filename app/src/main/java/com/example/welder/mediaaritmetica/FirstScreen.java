package com.example.welder.mediaaritmetica;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class FirstScreen extends AppCompatActivity {

    private EditText editValor1;
    private EditText editValor2;
    private EditText editResultado;
    private Button buttonCalcular;
    private Button limparButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        editValor1 = (EditText) findViewById(R.id.editValor1);
        editValor2 = (EditText) findViewById(R.id.editValor2);
        editResultado = (EditText) findViewById(R.id.editResultado);
        buttonCalcular = (Button) findViewById(R.id.calculateButton);
        limparButton = (Button) findViewById(R.id.resetButton);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                double valor1 = Double.parseDouble(editValor1.getText().toString());
                double valor2 = Double.parseDouble(editValor2.getText().toString());

                Double media = calcularMedia(valor1, valor2);

                editResultado.setText(media.toString());
                editResultado.setVisibility(View.VISIBLE);
            }
        });

        limparButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editValor1.setText("");
                editValor2.setText("");
                editResultado.setText("");
                editResultado.setVisibility(View.INVISIBLE);
            }
        });

    }

    private double calcularMedia(double valor1, double valor2) {
        return (valor1 + valor2) / 2;
    }

}
