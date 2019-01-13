package com.example.pc.tema4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DesplazandoImagenesActivity extends AppCompatActivity implements FragmentPerro.OnFragmentInteractionListener, FragmentGato.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
