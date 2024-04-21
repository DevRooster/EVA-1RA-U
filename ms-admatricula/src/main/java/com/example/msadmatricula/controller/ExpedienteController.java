package com.example.msadmatricula.controller;

import com.example.msadmatricula.entity.Expediente;
import com.example.msadmatricula.service.ExpedienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/expediente")
public class ExpedienteController {
    @Autowired
    private ExpedienteService expedienteService;

    @GetMapping
    public ResponseEntity<List<Expediente>> listar() {
        return ResponseEntity.ok(expedienteService.listar());
    }

    @PostMapping
    public ResponseEntity<Expediente> guardar(@RequestBody Expediente expediente) {
        return ResponseEntity.ok(expedienteService.guardar(expediente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Expediente> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(expedienteService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Expediente> actualizar(@RequestBody Expediente expediente) {
        return ResponseEntity.ok(expedienteService.actualizar(expediente));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Expediente>> eliminar(@PathVariable(required = true) Integer id) {
        expedienteService.eliminar(id);
        return ResponseEntity.ok(expedienteService.listar());
    }
}
