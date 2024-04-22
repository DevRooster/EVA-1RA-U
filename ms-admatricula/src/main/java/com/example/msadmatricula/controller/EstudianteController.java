package com.example.msadmatricula.controller;

import com.example.msadmatricula.entity.Estudiante;
import com.example.msadmatricula.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<List<Estudiante>> listar() {
        return ResponseEntity.ok(estudianteService.listar());
    }

    @PostMapping
    public ResponseEntity<Estudiante> guardar(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteService.guardar(estudiante));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(estudianteService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Estudiante> actualizar(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteService.actualizar(estudiante));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Estudiante>> eliminar(@PathVariable(required = true) Integer id) {
        estudianteService.eliminar(id);
        return ResponseEntity.ok(estudianteService.listar());
    }
}
