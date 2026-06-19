package com.empresa.pedido.model;

public class Pedido {
    private double total;

    public Pedido(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}