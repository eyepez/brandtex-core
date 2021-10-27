package com.brandtex.core.domain;

public class Paginas {

    private int idPagina;
    private int numNivel;
    private int idPadre;
    private String desRuta;
    private String desNombre;

    public int getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(int idPagina) {
        this.idPagina = idPagina;
    }

    public int getNumNivel() {
        return numNivel;
    }

    public void setNumNivel(int numNivel) {
        this.numNivel = numNivel;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public String getDesRuta() {
        return desRuta;
    }

    public void setDesRuta(String desRuta) {
        this.desRuta = desRuta;
    }

    public String getDesNombre() {
        return desNombre;
    }

    public void setDesNombre(String desNombre) {
        this.desNombre = desNombre;
    }

    @Override
    public String toString() {
        return "Paginas{" +
                "idPagina=" + idPagina +
                ", numNivel=" + numNivel +
                ", idPadre=" + idPadre +
                ", desRuta='" + desRuta + '\'' +
                ", desNombre='" + desNombre + '\'' +
                '}';
    }
}
