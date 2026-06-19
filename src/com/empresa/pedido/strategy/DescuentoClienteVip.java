package com.empresa.pedido.strategy;

public class DescuentoClienteVip implements PoliticaDescuento {
    @Override
    public double aplicarDescuento(double montoTotal) {
        return montoTotal * 0.80; // 20% de descuento
    }
}