package es.iesnervion.atellez.repasofragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListAdapter listAdapter;
    ArrayList<String> mensajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buscamos la lista en el layout
        listView = (ListView) findViewById(R.id.listiview);
        //Datos que vamos a mostrar en el listView
        mensajes = new ArrayList<String>();
        mensajes.add("Uno");
        mensajes.add("Dos");
        mensajes.add("Tres");
        mensajes.add("Cuatro");
        mensajes.add("Cinco");
        mensajes.add("Uno");
        mensajes.add("Dos");
        mensajes.add("Tres");
        mensajes.add("Cuatro");
        mensajes.add("Cinco");
        mensajes.add("Uno");
        mensajes.add("Dos");
        mensajes.add("Tres");
        mensajes.add("Cuatro");
        mensajes.add("Cinco");
        mensajes.add("Uno");
        mensajes.add("Dos");
        mensajes.add("Tres");
        mensajes.add("Cuatro");
        mensajes.add("Cinco");

        //Creacion del listado
        listAdapter = new ListAdapter(this, mensajes);
        //Establecemos el adaptador en la lista
        listView.setAdapter(listAdapter);
    }

    /*public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
}
