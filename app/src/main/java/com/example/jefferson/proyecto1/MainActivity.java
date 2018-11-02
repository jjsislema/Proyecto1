package com.example.jefferson.proyecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            TextView textView0 = (TextView)findViewById(R.id.textView0);
            TextView textView1 = (TextView)findViewById(R.id.textView1);
            TextView textView2 = (TextView)findViewById(R.id.textView2);
            TextView textView3 = (TextView)findViewById(R.id.textView3);
            TextView textView4 = (TextView)findViewById(R.id.textView4);
            TextView textView5 = (TextView)findViewById(R.id.textView5);
            TextView textView6 = (TextView)findViewById(R.id.textView6);
            TextView textView7 = (TextView)findViewById(R.id.textView7);
            TextView textView8 = (TextView)findViewById(R.id.textView8);
            TextView textView9 = (TextView)findViewById(R.id.textView9);

            textView0.setText(savedInstanceState.getString("txtTextView0"));
            textView1.setText(savedInstanceState.getString("txtTextView1"));
            textView2.setText(savedInstanceState.getString("txtTextView2"));
            textView3.setText(savedInstanceState.getString("txtTextView3"));
            textView4.setText(savedInstanceState.getString("txtTextView4"));
            textView5.setText(savedInstanceState.getString("txtTextView5"));
            textView6.setText(savedInstanceState.getString("txtTextView6"));
            textView7.setText(savedInstanceState.getString("txtTextView7"));
            textView8.setText(savedInstanceState.getString("txtTextView8"));
            textView9.setText(savedInstanceState.getString("txtTextView9"));
        }
    }

    public void showList(View view) {
        Intent intent = new Intent(this,ListaArticulos.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        TextView textView0 = (TextView)findViewById(R.id.textView0);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        TextView textView6 = (TextView)findViewById(R.id.textView6);
        TextView textView7 = (TextView)findViewById(R.id.textView7);
        TextView textView8 = (TextView)findViewById(R.id.textView8);
        TextView textView9 = (TextView)findViewById(R.id.textView9);

        outState.putString( "txtTextView0" , textView0.getText().toString() );
        outState.putString( "txtTextView1" , textView1.getText().toString() );
        outState.putString( "txtTextView2" , textView2.getText().toString() );
        outState.putString( "txtTextView3" , textView3.getText().toString() );
        outState.putString( "txtTextView4" , textView4.getText().toString() );
        outState.putString( "txtTextView5" , textView5.getText().toString() );
        outState.putString( "txtTextView6" , textView6.getText().toString() );
        outState.putString( "txtTextView7" , textView7.getText().toString() );
        outState.putString( "txtTextView8" , textView8.getText().toString() );
        outState.putString( "txtTextView9" , textView9.getText().toString() );

    }


    /**
     * Metodo para limpiar la lista del carrito de compras
     *
     * @param view Vista de la activity
     */
    public void clearList(View view) {

        TextView textView0 = (TextView)findViewById(R.id.textView0);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        TextView textView6 = (TextView)findViewById(R.id.textView6);
        TextView textView7 = (TextView)findViewById(R.id.textView7);
        TextView textView8 = (TextView)findViewById(R.id.textView8);
        TextView textView9 = (TextView)findViewById(R.id.textView9);

        textView0.setText("");
        textView1.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        textView5.setText("");
        textView6.setText("");
        textView7.setText("");
        textView8.setText("");
        textView9.setText("");

    }
}
