package com.example.mspedido.controller;


import com.example.mspedido.entity.PedidoDetalle;
import com.example.mspedido.service.PedidoDetalleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/pedidodetalle")
public class PedidoDetalleController {
    @Autowired
    private PedidoDetalleService pedidoDetalleService;

    @GetMapping
    ResponseEntity<List<PedidoDetalle>> lista(){
        return ResponseEntity.ok(pedidoDetalleService.lista());
    }
    @PostMapping
    ResponseEntity<PedidoDetalle> guardar(@RequestBody PedidoDetalle pedidoDetalle){
        return ResponseEntity.ok(pedidoDetalleService.guardar((pedidoDetalle)));
    }

    @GetMapping("/{id}")
    ResponseEntity<PedidoDetalle> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(pedidoDetalleService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<PedidoDetalle> actualizar(@RequestBody PedidoDetalle pedidoDetalle){
        return ResponseEntity.ok(pedidoDetalleService.actualizar((pedidoDetalle)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<PedidoDetalle>> eleminar(@PathVariable(required = true) Integer id){
        pedidoDetalleService.eleminar(id);
        return ResponseEntity.ok(pedidoDetalleService.lista());

    }
}
