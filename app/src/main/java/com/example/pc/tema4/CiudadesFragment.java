package com.example.pc.tema4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.security.acl.Group;



public class CiudadesFragment extends Fragment {

    RadioGroup grpCiudades;
    View v;

    public CiudadesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_ciudades, container, false);
        grpCiudades = v.findViewById(R.id.grpCiudades);


        grpCiudades.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String ciudad = ((RadioButton)v.findViewById(grpCiudades.getCheckedRadioButtonId())).getText().toString();
                TextView r = getActivity().findViewById(R.id.lblCiudad);
                r.setText(ciudad);

                Almacen.strCiudad = ciudad;
            }
        });{
            return v;
        }

    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
