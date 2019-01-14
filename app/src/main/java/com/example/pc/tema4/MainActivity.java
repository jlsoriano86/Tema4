package com.example.pc.tema4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button primos;
    Button desplazando;
    Button seleccionando;
    Button aciertos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


           primos =(Button)findViewById(R.id.btnNumerosPrimos);
           primos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent primos = new Intent(MainActivity.this, NumerosPrimosActivity.class);
                    startActivity(primos);
                }
            });

        desplazando =(Button)findViewById(R.id.btnDesplazandoImg);
        desplazando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desplazando = new Intent(MainActivity.this, DesplazandoImagenesActivity.class);
                startActivity(desplazando);
            }
        });

        seleccionando =(Button)findViewById(R.id.btnSeleccionandoImg);
        seleccionando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seleccionando = new Intent(MainActivity.this, SeleccionandoImagenesActivity.class);
                startActivity(seleccionando);
            }
        });

        aciertos =(Button)findViewById(R.id.btnJuegoAciertos);
        aciertos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aciertos = new Intent(MainActivity.this, JuegoDeAciertosActivity.class);
                startActivity(aciertos);
            }
        });



    }

  }
