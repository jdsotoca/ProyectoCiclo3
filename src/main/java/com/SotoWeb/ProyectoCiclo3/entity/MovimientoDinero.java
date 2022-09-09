package com.SotoWeb.ProyectoCiclo3.entity;

public class MovimientoDinero {

    private String monto;
    private String concepto;
    private String usuario;

    public MovimientoDinero(String monto, String concepto, String usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public MovimientoDinero() {

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
