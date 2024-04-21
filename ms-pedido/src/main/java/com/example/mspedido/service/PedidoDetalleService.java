package com.example.mspedido.service;

import com.example.mspedido.entity.Pedido;
import com.example.mspedido.entity.PedidoDetalle;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface PedidoDetalleService {
    List<PedidoDetalle> lista();
    PedidoDetalle guardar(PedidoDetalle pedidoDetalle);
    Optional<PedidoDetalle> buscarPorId(Integer id);
    PedidoDetalle actualizar(PedidoDetalle pedidoDetalle);
    void eleminar(Integer id);
}
