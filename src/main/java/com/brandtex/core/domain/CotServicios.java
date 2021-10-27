package com.brandtex.core.domain;

import java.math.BigDecimal;

public class CotServicios {

    private int idCotservicio;
    private int idCotizacion;
    private BigDecimal decPreciomolde;
    private BigDecimal decCostunitmolde;
    private BigDecimal decCosttotalmolde;
    private BigDecimal decPreciocorte;
    private BigDecimal decCostunitcorte;
    private BigDecimal decCosttotalcorte;
    private BigDecimal decPrecioconfec;
    private BigDecimal decCostunitconfec;
    private BigDecimal decCosttotalconfec;
    private BigDecimal decPreciobordado;
    private BigDecimal decCostunitbordado;
    private BigDecimal decCosttotalbordado;
    private BigDecimal decTotalcostunit;
    private BigDecimal decTotalcosttotal;

    public int getIdCotservicio() {
        return idCotservicio;
    }

    public void setIdCotservicio(int idCotservicio) {
        this.idCotservicio = idCotservicio;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public BigDecimal getDecPreciomolde() {
        return decPreciomolde;
    }

    public void setDecPreciomolde(BigDecimal decPreciomolde) {
        this.decPreciomolde = decPreciomolde;
    }

    public BigDecimal getDecCostunitmolde() {
        return decCostunitmolde;
    }

    public void setDecCostunitmolde(BigDecimal decCostunitmolde) {
        this.decCostunitmolde = decCostunitmolde;
    }

    public BigDecimal getDecCosttotalmolde() {
        return decCosttotalmolde;
    }

    public void setDecCosttotalmolde(BigDecimal decCosttotalmolde) {
        this.decCosttotalmolde = decCosttotalmolde;
    }

    public BigDecimal getDecPreciocorte() {
        return decPreciocorte;
    }

    public void setDecPreciocorte(BigDecimal decPreciocorte) {
        this.decPreciocorte = decPreciocorte;
    }

    public BigDecimal getDecCostunitcorte() {
        return decCostunitcorte;
    }

    public void setDecCostunitcorte(BigDecimal decCostunitcorte) {
        this.decCostunitcorte = decCostunitcorte;
    }

    public BigDecimal getDecCosttotalcorte() {
        return decCosttotalcorte;
    }

    public void setDecCosttotalcorte(BigDecimal decCosttotalcorte) {
        this.decCosttotalcorte = decCosttotalcorte;
    }

    public BigDecimal getDecPrecioconfec() {
        return decPrecioconfec;
    }

    public void setDecPrecioconfec(BigDecimal decPrecioconfec) {
        this.decPrecioconfec = decPrecioconfec;
    }

    public BigDecimal getDecCostunitconfec() {
        return decCostunitconfec;
    }

    public void setDecCostunitconfec(BigDecimal decCostunitconfec) {
        this.decCostunitconfec = decCostunitconfec;
    }

    public BigDecimal getDecCosttotalconfec() {
        return decCosttotalconfec;
    }

    public void setDecCosttotalconfec(BigDecimal decCosttotalconfec) {
        this.decCosttotalconfec = decCosttotalconfec;
    }

    public BigDecimal getDecPreciobordado() {
        return decPreciobordado;
    }

    public void setDecPreciobordado(BigDecimal decPreciobordado) {
        this.decPreciobordado = decPreciobordado;
    }

    public BigDecimal getDecCostunitbordado() {
        return decCostunitbordado;
    }

    public void setDecCostunitbordado(BigDecimal decCostunitbordado) {
        this.decCostunitbordado = decCostunitbordado;
    }

    public BigDecimal getDecCosttotalbordado() {
        return decCosttotalbordado;
    }

    public void setDecCosttotalbordado(BigDecimal decCosttotalbordado) {
        this.decCosttotalbordado = decCosttotalbordado;
    }

    public BigDecimal getDecTotalcostunit() {
        return decTotalcostunit;
    }

    public void setDecTotalcostunit(BigDecimal decTotalcostunit) {
        this.decTotalcostunit = decTotalcostunit;
    }

    public BigDecimal getDecTotalcosttotal() {
        return decTotalcosttotal;
    }

    public void setDecTotalcosttotal(BigDecimal decTotalcosttotal) {
        this.decTotalcosttotal = decTotalcosttotal;
    }

    @Override
    public String toString() {
        return "CotServicios{" +
                "idCotservicio=" + idCotservicio +
                ", idCotizacion=" + idCotizacion +
                ", decPreciomolde=" + decPreciomolde +
                ", decCostunitmolde=" + decCostunitmolde +
                ", decCosttotalmolde=" + decCosttotalmolde +
                ", decPreciocorte=" + decPreciocorte +
                ", decCostunitcorte=" + decCostunitcorte +
                ", decCosttotalcorte=" + decCosttotalcorte +
                ", decPrecioconfec=" + decPrecioconfec +
                ", decCostunitconfec=" + decCostunitconfec +
                ", decCosttotalconfec=" + decCosttotalconfec +
                ", decPreciobordado=" + decPreciobordado +
                ", decCostunitbordado=" + decCostunitbordado +
                ", decCosttotalbordado=" + decCosttotalbordado +
                ", decTotalcostunit=" + decTotalcostunit +
                ", decTotalcosttotal=" + decTotalcosttotal +
                '}';
    }
}
