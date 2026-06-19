package com.empresa.pedido.service;

import com.empresa.pedido.model.Pedido;
import com.empresa.pedido.repository.PedidosRepository;
import com.empresa.pedido.repository.NotificadorPedido;
import com.empresa.pedido.strategy.PoliticaDescuento;

public class ProcesarPedidoService {
    private final PedidosRepository repository;
    private final NotificadorPedido notificador;
    private final PoliticaDescuento politica;

    // Inyección por constructor (Principio de Inversión de Dependencias)
    public ProcesarPedidoService(PedidosRepository repository, NotificadorPedido notificador, PoliticaDescuento politica) {
        this.repository = repository;
        this.notificador = notificador;
        this.politica = politica;
    }

    public void procesar(Pedido pedido) {
        double totalConDescuento = politica.aplicarDescuento(pedido.getTotal());
        pedido.setTotal(totalConDescuento);
        repository.guardar(pedido);
        notificador.enviarNotificacion(pedido);
    }
}