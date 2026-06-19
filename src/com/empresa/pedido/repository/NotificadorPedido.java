package com.empresa.pedido.repository;
import com.empresa.pedido.model.Pedido;

public interface NotificadorPedido {
    void enviarNotificacion(Pedido pedido);
}