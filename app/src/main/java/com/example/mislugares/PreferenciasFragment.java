package com.example.mislugares;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.mislugares.R;

public class PreferenciasFragment extends PreferenceFragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
    //esta fragment sera remplazado alas preferencias como una ventana de poca vida y esta remplazara al activity preferencias
}

