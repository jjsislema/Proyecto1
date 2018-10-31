package com.example.jefferson.proyecto1;

public class Articulo {
    private int descripcion;
    private int src;

    public Articulo (int desc, int src){
        this.descripcion = desc;
                this.src = src;
    }


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
