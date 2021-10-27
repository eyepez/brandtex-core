package com.brandtex.core.domain;

public class CotTallas {

    private int idCottallas;
    private int idCotizacion;
    private int idTalla;
    private int numCantTalla;

    public int getIdCottallas() {
        return idCottallas;
    }

    public void setIdCottallas(int idCottallas) {
        this.idCottallas = idCottallas;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    public int getNumCantTalla() {
        return numCantTalla;
    }

    public void setNumCantTalla(int numCantTalla) {
        this.numCantTalla = numCantTalla;
    }

    @Override
    public String toString() {
        return "CotTallas{" +
                "idCottallas=" + idCottallas +
                ", idCotizacion=" + idCotizacion +
                ", idTalla=" + idTalla +
                ", numCantTalla=" + numCantTalla +
                '}';
    }
}
