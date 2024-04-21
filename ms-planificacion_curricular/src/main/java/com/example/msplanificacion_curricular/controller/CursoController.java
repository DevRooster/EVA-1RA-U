package com.example.msplanificacion_curricular.controller;


import com.example.msplanificacion_curricular.entity.Curso;
import com.example.msplanificacion_curricular.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping
    ResponseEntity<List<Curso>> lista(){
        return ResponseEntity.ok(cursoService.lista());
    }
    @PostMapping
    ResponseEntity<Curso> guardar(@RequestBody Curso curso) {
        return ResponseEntity.ok(cursoService.guardar((curso)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Curso> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(cursoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Curso> actualizar(@RequestBody Curso curso){
        return ResponseEntity.ok(cursoService.actualizar((curso)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Curso>> eleminar(@PathVariable(required = true) Integer id){
        cursoService.eleminar(id);
        return ResponseEntity.ok(cursoService.lista());

    }
}
