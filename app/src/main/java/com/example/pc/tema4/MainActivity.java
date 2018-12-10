package com.example.pc.tema4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button primos;
    Button imagenes;

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



    }

  }
