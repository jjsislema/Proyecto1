package com.example.jefferson.proyecto1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaArticulos extends AppCompatActivity {

    private Articulo articulos [] = new Articulo [20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_articulos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Articulo art = new Articulo("Alicate",R.drawable.alicate);
        //ImageView img = findViewById(R.id.art1);
        //img.setImageResource(art.getSrc());
        //img.setContentDescription(art.getDescripcion());
        setList();
        setViews();

    }

    //Seteo los imageView y los textView
    private void setViews (){
        //art 1
        ImageView img = findViewById(R.id.articulo1);
        TextView title = findViewById(R.id.titleArt1);
        img.setImageResource(articulos[0].getSrc());
        title.setText(articulos[0].getDescripcion());
        //art 2
        img = findViewById(R.id.articulo2);
        title = findViewById(R.id.titleArt2);
        img.setImageResource(articulos[1].getSrc());
        title.setText(articulos[1].getDescripcion());
    }

    //Seteo el arreglo de los articulos
    private void setList (){
        articulos[0] = new Articulo(R.string.art1,R.drawable.alicate);
        articulos[1] = new Articulo(R.string.art2,R.drawable.carretilla);
        articulos[2] = new Articulo(R.string.art3,R.drawable.cautin);
        articulos[3] = new Articulo(R.string.art4,R.drawable.cerrucho);
        articulos[4] = new Articulo(R.string.art5,R.drawable.destornillador);
        articulos[5] = new Articulo(R.string.art6,R.drawable.escardilla);
        articulos[6] = new Articulo(R.string.art7,R.drawable.esmeril);
        articulos[7] = new Articulo(R.string.art8,R.drawable.guantes);
        articulos[8] = new Articulo(R.string.art9,R.drawable.llave_inglesa);
        articulos[9] = new Articulo(R.string.art10,R.drawable.machete);
        articulos[10] = new Articulo(R.string.art11,R.drawable.mandarria);
        articulos[11] = new Articulo(R.string.art12,R.drawable.martillo);
        articulos[12] = new Articulo(R.string.art13,R.drawable.metro);
        articulos[13] = new Articulo(R.string.art14,R.drawable.multimetro);
        articulos[14] = new Articulo(R.string.art15,R.drawable.nivel);
        articulos[15] = new Articulo(R.string.art16,R.drawable.pala);
        articulos[16] = new Articulo(R.string.art17,R.drawable.pinza);
        articulos[17] = new Articulo(R.string.art18,R.drawable.segueta);
        articulos[18] = new Articulo(R.string.art19,R.drawable.socate);
        articulos[19] = new Articulo(R.string.art20,R.drawable.taladro);
    }

}
