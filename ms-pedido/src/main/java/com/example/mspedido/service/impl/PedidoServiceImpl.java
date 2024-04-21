package com.example.mspedido.service.impl;

import com.example.mspedido.dto.ClienteDto;
import com.example.mspedido.entity.Pedido;
import com.example.mspedido.entity.PedidoDetalle;
import com.example.mspedido.feign.CatalogoFeign;
import com.example.mspedido.feign.ClienteFeign;
import com.example.mspedido.repository.PedidoRepository;
import com.example.mspedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ClienteFeign clienteFeign;

    @Autowired
    private CatalogoFeign catalogoFeign;
    @Override
    public List<Pedido> lista() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        
        return pedidoRepository.save(pedido);
    }

    @Override
    public Optional<Pedido> buscarPorId(Integer id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        ClienteDto clienteDto = clienteFeign.buscarPorId(pedido.get().getClienteid()).getBody();
       List<PedidoDetalle> pedidoDetalles = pedido.get().getDetalle().stream().map(pedidoDetalle -> {
           pedidoDetalle.setProductoDto(catalogoFeign.productoBuscarPorId(pedidoDetalle.getProductoId()).getBody());
           return pedidoDetalle;
       }).toList();
        pedido.get().setClienteDto(clienteDto);
        pedido.get().setDetalle(pedidoDetalles);
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido actualizar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public void eleminar(Integer id) {
        pedidoRepository.deleteById(id);

    }
}
