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



public class PaisesFragment extends Fragment {

    RadioGroup grpPaises;
    View v;

    public PaisesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_paises, container, false);
        grpPaises = v.findViewById(R.id.grpPaises);


        grpPaises.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String pais = ((RadioButton)v.findViewById(grpPaises.getCheckedRadioButtonId())).getText().toString();
                TextView r = getActivity().findViewById(R.id.lblPais);
                r.setText(pais);

                Almacen.strPais = pais;
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
