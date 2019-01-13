package com.example.pc.tema4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeleccionandoImagenesActivity extends AppCompatActivity implements FragmentRosa.OnFragmentInteractionListener, FragmentMargarita.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);
    }

    public void pressRosa(View view){
        findViewById(R.id.FRosa).setVisibility(View.VISIBLE);
        findViewById(R.id.FMargarita).setVisibility(View.GONE);

    }

    public void pressMargarita(View view){
        findViewById(R.id.FRosa).setVisibility(View.GONE);
        findViewById(R.id.FMargarita).setVisibility(View.VISIBLE);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
