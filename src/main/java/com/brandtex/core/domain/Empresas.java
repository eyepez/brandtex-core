package com.brandtex.core.domain;

public class Empresas {

    private int idEmpresa;
    private String desEmpresa;
    private String numDoc;
    private String desDireccion;
    private String desRazonSocial;
    private int idTipDoc;
    private int numTelefono;
    private String desRepresentante;
    private int numTelefonoRep;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getDesEmpresa() {
        return desEmpresa;
    }

    public void setDesEmpresa(String desEmpresa) {
        this.desEmpresa = desEmpresa;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getDesDireccion() {
        return desDireccion;
    }

    public void setDesDireccion(String desDireccion) {
        this.desDireccion = desDireccion;
    }

    public String getDesRazonSocial() {
        return desRazonSocial;
    }

    public void setDesRazonSocial(String desRazonSocial) {
        this.desRazonSocial = desRazonSocial;
    }

    public int getIdTipDoc() {
        return idTipDoc;
    }

    public void setIdTipDoc(int idTipDoc) {
        this.idTipDoc = idTipDoc;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getDesRepresentante() {
        return desRepresentante;
    }

    public void setDesRepresentante(String desRepresentante) {
        this.desRepresentante = desRepresentante;
    }

    public int getNumTelefonoRep() {
        return numTelefonoRep;
    }

    public void setNumTelefonoRep(int numTelefonoRep) {
        this.numTelefonoRep = numTelefonoRep;
    }

    @Override
    public String toString() {
        return "Empresas{" +
                "idEmpresa=" + idEmpresa +
                ", desEmpresa='" + desEmpresa + '\'' +
                ", numDoc='" + numDoc + '\'' +
                ", desDireccion='" + desDireccion + '\'' +
                ", desRazonSocial='" + desRazonSocial + '\'' +
                ", idTipDoc=" + idTipDoc +
                ", numTelefono=" + numTelefono +
                ", desRepresentante='" + desRepresentante + '\'' +
                ", numTelefonoRep=" + numTelefonoRep +
                '}';
    }
}
