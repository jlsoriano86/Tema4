package com.example.pc.tema4;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimosActivity extends AppCompatActivity {
    EditText txtNumero;
    Button btnCalcular;
    TextView txtResultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

   txtNumero = (EditText) findViewById(R.id.txtNumero);
   btnCalcular = (Button) findViewById(R.id.btnCalcular);
   txtResultado = (TextView) findViewById(R.id.txtResultado);

   btnCalcular.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           int numero = Integer.parseInt(txtNumero.getText().toString());
           int acu=0, i;
           for  (i=1; i<numero; i++){
               if (numero % i == 0) {
                   acu++;
               }
               }

         if (acu == 2){
               txtResultado.setText("Es un número primo");
            }
        else{
               txtResultado.setText("No es un número primo");
         }
         }
         });

      }
}
