package com.brandtex.core.domain;

import java.math.BigDecimal;

public class CotMateriaPrima {

    private int idCotmateriaprima;
    private int idCotizacion;
    private String desMateriaprima;
    private BigDecimal numCantidad;
    private BigDecimal decPrecio;
    private BigDecimal decCostunit;
    private BigDecimal decTotal;
    private int idUnidad;

    public int getIdCotmateriaprima() {
        return idCotmateriaprima;
    }

    public void setIdCotmateriaprima(int idCotmateriaprima) {
        this.idCotmateriaprima = idCotmateriaprima;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public String getDesMateriaprima() {
        return desMateriaprima;
    }

    public void setDesMateriaprima(String desMateriaprima) {
        this.desMateriaprima = desMateriaprima;
    }

    public BigDecimal getNumCantidad() {
        return numCantidad;
    }

    public void setNumCantidad(BigDecimal numCantidad) {
        this.numCantidad = numCantidad;
    }

    public BigDecimal getDecPrecio() {
        return decPrecio;
    }

    public void setDecPrecio(BigDecimal decPrecio) {
        this.decPrecio = decPrecio;
    }

    public BigDecimal getDecCostunit() {
        return decCostunit;
    }

    public void setDecCostunit(BigDecimal decCostunit) {
        this.decCostunit = decCostunit;
    }

    public BigDecimal getDecTotal() {
        return decTotal;
    }

    public void setDecTotal(BigDecimal decTotal) {
        this.decTotal = decTotal;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    @Override
    public String toString() {
        return "CotMateriaPrima{" +
                "idCotmateriaprima=" + idCotmateriaprima +
                ", idCotizacion=" + idCotizacion +
                ", desMateriaprima='" + desMateriaprima + '\'' +
                ", numCantidad=" + numCantidad +
                ", decPrecio=" + decPrecio +
                ", decCostunit=" + decCostunit +
                ", decTotal=" + decTotal +
                ", idUnidad=" + idUnidad +
                '}';
    }
}
