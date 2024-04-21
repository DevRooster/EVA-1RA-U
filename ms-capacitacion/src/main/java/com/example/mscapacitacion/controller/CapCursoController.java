package com.example.mscapacitacion.controller;

import com.example.mscapacitacion.entity.CapCurso;
import com.example.mscapacitacion.service.CapCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/capcurso")
public class CapCursoController {
    @Autowired
    private CapCursoService capcursoService;

    @GetMapping
    public ResponseEntity<List<CapCurso>> listar() {
        return ResponseEntity.ok(capcursoService.listar());
    }

    @PostMapping
    public ResponseEntity<CapCurso> guardar(@RequestBody CapCurso capcurso) {
        return ResponseEntity.ok(capcursoService.guardar(capcurso));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CapCurso> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(capcursoService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<CapCurso> actualizar(@RequestBody CapCurso capcurso) {
        return ResponseEntity.ok(capcursoService.actualizar(capcurso));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<CapCurso>> eliminar(@PathVariable(required = true) Integer id) {
        capcursoService.eliminar(id);
        return ResponseEntity.ok(capcursoService.listar());
    }
}
