package com.brandtex.core.domain;

public class ParametroValor {

    private int idParametroValor;
    private String desParametroValor;
    private int idParamLlave;

    public int getIdParametroValor() {
        return idParametroValor;
    }

    public void setIdParametroValor(int idParametroValor) {
        this.idParametroValor = idParametroValor;
    }

    public String getDesParametroValor() {
        return desParametroValor;
    }

    public void setDesParametroValor(String desParametroValor) {
        this.desParametroValor = desParametroValor;
    }

    public int getIdParamLlave() {
        return idParamLlave;
    }

    public void setIdParamLlave(int idParamLlave) {
        this.idParamLlave = idParamLlave;
    }

    @Override
    public String toString() {
        return "ParametroValor{" +
                "idParametroValor=" + idParametroValor +
                ", desParametroValor='" + desParametroValor + '\'' +
                ", idParamLlave=" + idParamLlave +
                '}';
    }
}
