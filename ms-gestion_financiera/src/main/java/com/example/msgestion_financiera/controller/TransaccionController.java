package com.example.msgestion_financiera.controller;

import com.example.msgestion_financiera.entity.Transaccion;
import com.example.msgestion_financiera.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    private TransaccionService transaccionService;

    @GetMapping
    ResponseEntity<List<Transaccion>> lista(){
        return ResponseEntity.ok(transaccionService.lista());
    }
    @PostMapping
    ResponseEntity<Transaccion> guardar(@RequestBody Transaccion transaccion) {
        return ResponseEntity.ok(transaccionService.guardar((transaccion)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Transaccion> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(transaccionService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Transaccion> actualizar(@RequestBody Transaccion transaccion){
        return ResponseEntity.ok(transaccionService.actualizar((transaccion)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Transaccion>> eliminar(@PathVariable(required = true) Integer id){
        transaccionService.eliminar(id);
        return ResponseEntity.ok(transaccionService.lista());

    }
}
