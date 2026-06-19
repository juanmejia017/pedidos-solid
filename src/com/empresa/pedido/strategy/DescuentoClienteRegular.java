package com.empresa.pedido.strategy;

public class DescuentoClienteRegular implements PoliticaDescuento {
    @Override
    public double aplicarDescuento(double montoTotal) {
        return montoTotal * 0.95; // 5% de descuento
    }
}