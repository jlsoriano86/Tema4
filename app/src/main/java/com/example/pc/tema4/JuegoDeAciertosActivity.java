package com.example.pc.tema4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class JuegoDeAciertosActivity extends AppCompatActivity implements PaisesFragment.OnFragmentInteractionListener, CiudadesFragment.OnFragmentInteractionListener {
    public static TextView lblPais;
    public static TextView lblCiudad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);
        lblPais = findViewById(R.id.lblPais);
        lblCiudad = findViewById(R.id.lblCiudad);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }

    public void comprobar(View view) {
        Log.i("App", "El país es: " + Almacen.strPais);
        Log.i("App", "La ciudad es: " + Almacen.strCiudad);
    }

    public void verificar(){
        
    }
}
