package com.example.jefferson.proyecto1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String textoEjemplo = "HOLA SOY SOLO UN EJEMPLO";
    private TextView artRequest ;
    public static final int CHOOSE_ARTICULO_REQUEST = 1;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            artRequest= (TextView)findViewById(R.id.textView0);
            artRequest.setText(savedInstanceState.getString("txtTextView0"));
        }

    }

    public void showList(View view) {
        Intent intent = new Intent(this,ListaArticulos.class);
        //startActivity (intent);
        startActivityForResult(intent,CHOOSE_ARTICULO_REQUEST);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView textView = (TextView)findViewById(R.id.textView0);
        outState.putString( "txtTextView0" , textView.getText().toString() );
    }

    public void onClickTest(View view){
        TextView textView = (TextView)findViewById(R.id.textView0);
        textView.setText(textoEjemplo);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CHOOSE_ARTICULO_REQUEST) {
            if (resultCode == Activity.RESULT_OK) {
                Articulo art = (Articulo) data.getExtras().getSerializable(ListaArticulos.EXTRA_REPLY);
                ///Log.d(LOG_TAG, "Mensaje_Reply: "+mensaje);
                if (art != null) {
                    TextView textView = (TextView)findViewById(R.id.textView0);
                    textView.setText(art.getDescripcion());
                }
            }
        }
    }
}
