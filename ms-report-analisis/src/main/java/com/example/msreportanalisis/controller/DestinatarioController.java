package com.example.msreportanalisis.controller;

import com.example.msreportanalisis.entity.Destinatario;
import com.example.msreportanalisis.service.DestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/destinatario")
public class DestinatarioController {
    @Autowired
    private DestinatarioService destinatarioService;

    @GetMapping
    public ResponseEntity<List<Destinatario>> listar() {
        return ResponseEntity.ok(destinatarioService.listar());
    }

    @PostMapping
    public ResponseEntity<Destinatario> guardar(@RequestBody Destinatario destinatario) {
        return ResponseEntity.ok(destinatarioService.guardar(destinatario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destinatario> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(destinatarioService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Destinatario> actualizar(@RequestBody Destinatario destinatario) {
        return ResponseEntity.ok(destinatarioService.actualizar(destinatario));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Destinatario>> eliminar(@PathVariable(required = true) Integer id) {
        destinatarioService.eliminar(id);
        return ResponseEntity.ok(destinatarioService.listar());
    }
}
