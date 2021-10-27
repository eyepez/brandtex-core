package com.brandtex.core.domain;

import java.sql.Date;

public class Pedidos {

    private int idPedidos;
    private Date fecPedido;
    private Date fecEntrega;
    private Date fecPago;
    private String desResponsable;
    private Date fecTenEntrega;
    private int idEstado;
    private int idEmpresa;

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Date getFecPedido() {
        return fecPedido;
    }

    public void setFecPedido(Date fecPedido) {
        this.fecPedido = fecPedido;
    }

    public Date getFecEntrega() {
        return fecEntrega;
    }

    public void setFecEntrega(Date fecEntrega) {
        this.fecEntrega = fecEntrega;
    }

    public Date getFecPago() {
        return fecPago;
    }

    public void setFecPago(Date fecPago) {
        this.fecPago = fecPago;
    }

    public String getDesResponsable() {
        return desResponsable;
    }

    public void setDesResponsable(String desResponsable) {
        this.desResponsable = desResponsable;
    }

    public Date getFecTenEntrega() {
        return fecTenEntrega;
    }

    public void setFecTenEntrega(Date fecTenEntrega) {
        this.fecTenEntrega = fecTenEntrega;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "idPedidos=" + idPedidos +
                ", fecPedido=" + fecPedido +
                ", fecEntrega=" + fecEntrega +
                ", fecPago=" + fecPago +
                ", desResponsable='" + desResponsable + '\'' +
                ", fecTenEntrega=" + fecTenEntrega +
                ", idEstado=" + idEstado +
                ", idEmpresa=" + idEmpresa +
                '}';
    }
}
