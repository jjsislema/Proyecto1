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
    private int[] imagenesId = new int[20];
    private int[] textosId = new int[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_articulos);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

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
        setImagenesid();
        setTextosId();
        setViews();

    }

    //Seteo los imageView y los textView
    private void setViews (){
        ImageView img;
        TextView title;
        for (int i = 0; i < 10; i++) {
            img = findViewById(imagenesId[i]);
            title = findViewById(textosId[i]);
            img.setImageResource(articulos[i].getSrc());
            title.setText(articulos[i].getDescripcion());
        }
        /*
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
        //art 3
        img = findViewById(R.id.articulo3);
        title = findViewById(R.id.titleArt3);
        img.setImageResource(articulos[2].getSrc());
        title.setText(articulos[2].getDescripcion());
        //art 4
        img = findViewById(R.id.articulo4);
        title = findViewById(R.id.titleArt4);
        img.setImageResource(articulos[3].getSrc());
        title.setText(articulos[3].getDescripcion());
        */
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

    //seteo de los ids para las imageView
    private void setImagenesid(){
        imagenesId[0]=R.id.articulo1;
        imagenesId[1]=R.id.articulo2;
        imagenesId[2]=R.id.articulo3;
        imagenesId[3]=R.id.articulo4;
        imagenesId[4]=R.id.articulo5;
        imagenesId[5]=R.id.articulo6;
        imagenesId[6]=R.id.articulo7;
        imagenesId[7]=R.id.articulo8;
        imagenesId[8]=R.id.articulo9;
        imagenesId[9]=R.id.articulo10;
        imagenesId[10]=R.id.articulo11;
        imagenesId[11]=R.id.articulo12;
        imagenesId[12]=R.id.articulo13;
        imagenesId[13]=R.id.articulo14;
        imagenesId[14]=R.id.articulo15;
        imagenesId[15]=R.id.articulo16;
        imagenesId[16]=R.id.articulo17;
        imagenesId[17]=R.id.articulo18;
        imagenesId[18]=R.id.articulo19;
        imagenesId[19]=R.id.articulo20;

    }
    //seteo de los id de los textView
    private void setTextosId(){
        textosId[0]=R.id.titleArt1;
        textosId[1]=R.id.titleArt2;
        textosId[2]=R.id.titleArt3;
        textosId[3]=R.id.titleArt4;
        textosId[4]=R.id.titleArt5;
        textosId[5]=R.id.titleArt6;
        textosId[6]=R.id.titleArt7;
        textosId[7]=R.id.titleArt8;
        textosId[8]=R.id.titleArt9;
        textosId[9]=R.id.titleArt10;
        textosId[10]=R.id.titleArt11;
        textosId[11]=R.id.titleArt12;
        textosId[12]=R.id.titleArt13;
        textosId[13]=R.id.titleArt14;
        textosId[14]=R.id.titleArt15;
        textosId[15]=R.id.titleArt16;
        textosId[16]=R.id.titleArt17;
        textosId[17]=R.id.titleArt18;
        textosId[18]=R.id.titleArt19;
        textosId[19]=R.id.titleArt20;
    }
}
