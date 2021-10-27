package com.brandtex.core.domain;

public class Usuarios {

    private int idUsuario;
    private String desUsuario;
    private int idPerfil;
    private String desLogin;
    private String desClave;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDesUsuario() {
        return desUsuario;
    }

    public void setDesUsuario(String desUsuario) {
        this.desUsuario = desUsuario;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getDesLogin() {
        return desLogin;
    }

    public void setDesLogin(String desLogin) {
        this.desLogin = desLogin;
    }

    public String getDesClave() {
        return desClave;
    }

    public void setDesClave(String desClave) {
        this.desClave = desClave;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "idUsuario=" + idUsuario +
                ", desUsuario='" + desUsuario + '\'' +
                ", idPerfil=" + idPerfil +
                ", desLogin='" + desLogin + '\'' +
                ", desClave='" + desClave + '\'' +
                '}';
    }
}
