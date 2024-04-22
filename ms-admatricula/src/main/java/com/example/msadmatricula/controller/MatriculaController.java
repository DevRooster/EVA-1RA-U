package com.example.msadmatricula.controller;

import com.example.msadmatricula.entity.Matricula;
import com.example.msadmatricula.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public ResponseEntity<List<Matricula>> listar() {
        return ResponseEntity.ok(matriculaService.listar());
    }

    @PostMapping
    public ResponseEntity<Matricula> guardar(@RequestBody Matricula matricula) {
        return ResponseEntity.ok(matriculaService.guardar(matricula));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Matricula> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(matriculaService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Matricula> actualizar(@RequestBody Matricula matricula) {
        return ResponseEntity.ok(matriculaService.actualizar(matricula));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Matricula>> eliminar(@PathVariable(required = true) Integer id) {
        matriculaService.eliminar(id);
        return ResponseEntity.ok(matriculaService.listar());
    }
}
