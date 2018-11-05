package com.example.jefferson.proyecto1;

import java.io.Serializable;



public class Articulo implements Serializable {

    //Atributos
    private int descripcion;
    private int src;

    //Constructor de la clase
    public Articulo (int desc, int src){
        this.descripcion = desc;
                this.src = src;
    }

    //Metodos o Comportamiento
    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }
}
