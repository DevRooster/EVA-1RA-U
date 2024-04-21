package com.example.mspedido.service;

import com.example.mspedido.entity.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface PedidoService {
    List<Pedido> lista();
    Pedido guardar(Pedido pedido);
    Optional<Pedido> buscarPorId(Integer id);
    Pedido actualizar(Pedido pedido);
    void eleminar(Integer id);
}
