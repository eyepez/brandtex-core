package com.brandtex.core.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class CajaChica {

    private int idCajachica;
    private Date fecRegistro;
    private String desMovimiento;
    private String desResponsable;
    private String desComprobante;
    private String desObservacion;
    private BigDecimal numMonto;
    private int idTipGasto;
    private int idTipMovimiento;
    private int idpedido;

    public int getIdCajachica() {
        return idCajachica;
    }

    public void setIdCajachica(int idCajachica) {
        this.idCajachica = idCajachica;
    }

    public Date getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    public String getDesMovimiento() {
        return desMovimiento;
    }

    public void setDesMovimiento(String desMovimiento) {
        this.desMovimiento = desMovimiento;
    }

    public String getDesResponsable() {
        return desResponsable;
    }

    public void setDesResponsable(String desResponsable) {
        this.desResponsable = desResponsable;
    }

    public String getDesComprobante() {
        return desComprobante;
    }

    public void setDesComprobante(String desComprobante) {
        this.desComprobante = desComprobante;
    }

    public String getDesObservacion() {
        return desObservacion;
    }

    public void setDesObservacion(String desObservacion) {
        this.desObservacion = desObservacion;
    }

    public BigDecimal getNumMonto() {
        return numMonto;
    }

    public void setNumMonto(BigDecimal numMonto) {
        this.numMonto = numMonto;
    }

    public int getIdTipGasto() {
        return idTipGasto;
    }

    public void setIdTipGasto(int idTipGasto) {
        this.idTipGasto = idTipGasto;
    }

    public int getIdTipMovimiento() {
        return idTipMovimiento;
    }

    public void setIdTipMovimiento(int idTipMovimiento) {
        this.idTipMovimiento = idTipMovimiento;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    @Override
    public String toString() {
        return "CajaChica{" +
                "idCajachica=" + idCajachica +
                ", fecRegistro=" + fecRegistro +
                ", desMovimiento='" + desMovimiento + '\'' +
                ", desResponsable='" + desResponsable + '\'' +
                ", desComprobante='" + desComprobante + '\'' +
                ", desObservacion='" + desObservacion + '\'' +
                ", numMonto=" + numMonto +
                ", idTipGasto=" + idTipGasto +
                ", idTipMovimiento=" + idTipMovimiento +
                ", idpedido=" + idpedido +
                '}';
    }
}
