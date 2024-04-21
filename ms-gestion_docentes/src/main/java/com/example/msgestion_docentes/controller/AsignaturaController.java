package com.example.msgestion_docentes.controller;


import com.example.msgestion_docentes.entity.Asignatura;
import com.example.msgestion_docentes.service.AsignaturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/asignatura")
public class AsignaturaController {
    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    ResponseEntity<List<Asignatura>> lista(){
        return ResponseEntity.ok(asignaturaService.lista());
    }
    @PostMapping
    ResponseEntity<Asignatura> guardar(@RequestBody Asignatura asignatura) {
        return ResponseEntity.ok(asignaturaService.guardar((asignatura)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Asignatura> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(asignaturaService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Asignatura> actualizar(@RequestBody Asignatura asignatura){
        return ResponseEntity.ok(asignaturaService.actualizar((asignatura)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Asignatura>> eleminar(@PathVariable(required = true) Integer id){
        asignaturaService.eleminar(id);
        return ResponseEntity.ok(asignaturaService.lista());

    }
}
