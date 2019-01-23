package com.example.pc.tema4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimosActivity extends AppCompatActivity {

    EditText txtNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);
        txtNumero = findViewById(R.id.txtNumero);
    }

    public void calcularPrimo(View view) {

        if(!txtNumero.getText().toString().isEmpty()) {



        String strSiEsPrimo = "Es un número primo";
        String strNoEsPrimo = "No es un número primo";

        TextView txtNumero = findViewById(R.id.txtNumero);
        Long numero = Long.parseLong(txtNumero.getText().toString());



        boolean esPrimo = true;
        Long i = 0L;
        // Long tope = numero;
        // Long tope = numero/2;
        Long tope = (long) Math.sqrt(numero);

        Long inicio = System.currentTimeMillis();
        for  (i=2L; i<tope; i++){
            if (numero % i == 0) {
                esPrimo = false; break;
            }
        }
        Long acaba = System.currentTimeMillis();

        Log.i("NUMPRIM", "El primer divisor es:  " + i);
        Log.i("NUMPRIM", "inicio: " + inicio);
        Log.i("NUMPRIM", "acaba: " + acaba);
        Log.i("NUMPRIM", "tiempo empleado: " + (acaba-inicio));

        ((TextView)findViewById(R.id.txtResultado)).setText ( esPrimo ? strSiEsPrimo : strNoEsPrimo);
        }
    }

}