package com.brandtex.core.domain;

public class ParametroLlavve {

    private int idParamLlave;
    private String desParamLlave;

    public int getIdParamLlave() {
        return idParamLlave;
    }

    public void setIdParamLlave(int idParamLlave) {
        this.idParamLlave = idParamLlave;
    }

    public String getDesParamLlave() {
        return desParamLlave;
    }

    public void setDesParamLlave(String desParamLlave) {
        this.desParamLlave = desParamLlave;
    }

    @Override
    public String toString() {
        return "ParametroLlavve{" +
                "idParamLlave=" + idParamLlave +
                ", desParamLlave='" + desParamLlave + '\'' +
                '}';
    }
}
