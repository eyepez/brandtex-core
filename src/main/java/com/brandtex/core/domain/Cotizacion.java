package com.brandtex.core.domain;

import java.sql.Date;

public class Cotizacion {

    private int idCotizacion;
    private Date fecCotizacion;
    private int idEmpresa;
    private int idPrenda;
    private String desModelo;
    private String desColor;
    private String desTela;
    private String desDetalle;
    private String desBordado;
    private int numCantidad;

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public Date getFecCotizacion() {
        return fecCotizacion;
    }

    public void setFecCotizacion(Date fecCotizacion) {
        this.fecCotizacion = fecCotizacion;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getDesModelo() {
        return desModelo;
    }

    public void setDesModelo(String desModelo) {
        this.desModelo = desModelo;
    }

    public String getDesColor() {
        return desColor;
    }

    public void setDesColor(String desColor) {
        this.desColor = desColor;
    }

    public String getDesTela() {
        return desTela;
    }

    public void setDesTela(String desTela) {
        this.desTela = desTela;
    }

    public String getDesDetalle() {
        return desDetalle;
    }

    public void setDesDetalle(String desDetalle) {
        this.desDetalle = desDetalle;
    }

    public String getDesBordado() {
        return desBordado;
    }

    public void setDesBordado(String desBordado) {
        this.desBordado = desBordado;
    }

    public int getNumCantidad() {
        return numCantidad;
    }

    public void setNumCantidad(int numCantidad) {
        this.numCantidad = numCantidad;
    }

    @Override
    public String toString() {
        return "Cotizacion{" +
                "idCotizacion=" + idCotizacion +
                ", fecCotizacion=" + fecCotizacion +
                ", idEmpresa=" + idEmpresa +
                ", idPrenda=" + idPrenda +
                ", desModelo='" + desModelo + '\'' +
                ", desColor='" + desColor + '\'' +
                ", desTela='" + desTela + '\'' +
                ", desDetalle='" + desDetalle + '\'' +
                ", desBordado='" + desBordado + '\'' +
                ", numCantidad=" + numCantidad +
                '}';
    }
}
