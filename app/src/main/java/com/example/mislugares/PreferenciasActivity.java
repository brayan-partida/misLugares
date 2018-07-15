package com.example.mislugares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PreferenciasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PreferenciasFragment())
                .commit();
        //mostrara el fragment que tomaa los datos de preferencas

    }
}
