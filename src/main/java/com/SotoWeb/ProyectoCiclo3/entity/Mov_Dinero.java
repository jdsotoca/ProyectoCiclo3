package com.SotoWeb.ProyectoCiclo3.entity;

public class Mov_Dinero {

    private String monto;
    private String concepto;
    private String usuario;

    public Mov_Dinero(String monto, String concepto, String usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Mov_Dinero{" +
                "monto='" + monto + '\'' +
                ", concepto='" + concepto + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
