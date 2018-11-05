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
    /**
     *  @params nothing
     *  @return int descripcion
     */
    public int getDescripcion() {
        return descripcion;
    }

    /**
     *  @params int descripcion
     *  @return nothing
     */
    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *  @params nothing
     *  @return int src
     */
    public int getSrc() {
        return src;
    }

    /**
     *  @params int src
     *  @return nothing
     */
    public void setSrc(int src) {
        this.src = src;
    }
}
