package com.example.msreportanalisis.controller;

import com.example.msreportanalisis.entity.Mensaje;
import com.example.msreportanalisis.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {
    @Autowired
    private MensajeService mensajeService;

    @GetMapping
    public ResponseEntity<List<Mensaje>> listar() {
        return ResponseEntity.ok(mensajeService.listar());
    }

    @PostMapping
    public ResponseEntity<Mensaje> guardar(@RequestBody Mensaje mensaje) {
        return ResponseEntity.ok(mensajeService.guardar(mensaje));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mensaje> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(mensajeService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Mensaje> actualizar(@RequestBody Mensaje mensaje) {
        return ResponseEntity.ok(mensajeService.actualizar(mensaje));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Mensaje>> eliminar(@PathVariable(required = true) Integer id) {
        mensajeService.eliminar(id);
        return ResponseEntity.ok(mensajeService.listar());
    }
}