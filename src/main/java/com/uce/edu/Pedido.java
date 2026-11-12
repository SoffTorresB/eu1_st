package com.uce.edu;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Pedido {

    

    public Pedido() {
      
    }

    private String codigo;
    private String producto;
    private double valor;
    private String tipo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pedido(String cliente, String producto, double total, String correo) {
        this.producto = producto;
        this.valor = total;
        this.tipo = correo;
    }

}
