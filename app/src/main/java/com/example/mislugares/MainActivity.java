package com.example.mislugares;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu){


        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }//metodo para insertar el menu en mi actividad------------------

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.acercaDe) {
            Intent intent = new Intent(this, AcercaDE.class);
            startActivity(intent);

return true;
        }//--
        if (id == R.id.action_settings) {
            lanzarpreferencias(null);

return true;
        }//--
        return super.onOptionsItemSelected(item);//que retorne un elemento
    }//metodo para  implentar los item en mi actividad del menu




    public boolean lanzarpreferencias(Intent intent) {
         intent = new Intent(this, PreferenciasActivity.class);
        startActivity(intent);
return true;
    }//lanzo las preferencias desde aqui lo mando a llamar

    public void lanzarAcercade(){



    }//lanzo acerca de
    public void mostrarPreferencias(View view){//con esto se mostrara la preferencias


        SharedPreferences pref =
                PreferenceManager.getDefaultSharedPreferences(this);
        String s = "notificaciones: "+ pref.getBoolean("notificaciones",true)
                +", máximo a listar: " + pref.getString("maximo","?");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    /*El código comienza creando el objeto pref de la clase SharedPreferences y le asigna
    las preferencias definidas para la aplicación.
     A continuación crea el String s y le asigna los valores de dos de las  preferencias.
     Se utilizan los métodos pref.getBoolean() y pref.getString(),
      que disponen de dos parámetros: el valor de key que queremos buscar ("notificaciones" y "maximo")
       y el valor asignado por defecto en caso de no encontrar esta key.

Finalmente se visualiza el resultado utilizando la clase Toast. Los tres parámetros indicados son el contexto (nuestra actividad),  el String a mostrar y el tiempo que se estará mostrando esta información.*/
}

