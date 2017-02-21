package es.iesnervion.atellez.repasofragments;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by alvarotellez on 21/2/17.
 */

public class ListAdapter extends ArrayAdapter<String>{

    private Activity activity;
    ArrayList<String> mensajes;

    public ListAdapter(Activity activity, ArrayList<String> mensajes){
        super(activity,R.layout.activity_fila);
        this.activity = activity;
        this.mensajes = mensajes;
    }

    static class ViewHolder{
        protected TextView nameTextView;
    }
    public int getCount(){
        return mensajes.size();
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(final int position, View convertView, final ViewGroup parent){

        View view = null;
        //Inflamos nuestra vista con el layout
        LayoutInflater inflator = activity.getLayoutInflater();
        //Le decimos de donde sacar el layout
        view = inflator.inflate(R.layout.activity_fila,null);
        final ViewHolder viewHolder = new ViewHolder();
        //Cogemos el textView de la activity_fila para adaptarlo al listview
        viewHolder.nameTextView = (TextView) view.findViewById(R.id.nameTextView);
        //Sacamos el texto
        viewHolder.nameTextView.setText(mensajes.get(position));

        return view;
    }

}
