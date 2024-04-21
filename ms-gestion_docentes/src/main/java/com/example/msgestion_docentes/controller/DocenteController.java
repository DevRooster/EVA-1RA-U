package com.example.msgestion_docentes.controller;


import com.example.msgestion_docentes.entity.Docente;
import com.example.msgestion_docentes.service.DocenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/docente")
public class DocenteController {
    @Autowired
    private DocenteService docenteService;

    @GetMapping
    ResponseEntity<List<Docente>> lista(){
        return ResponseEntity.ok(docenteService.lista());
    }
    @PostMapping
    ResponseEntity<Docente> guardar(@RequestBody Docente docente) {
        return ResponseEntity.ok(docenteService.guardar((docente)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Docente> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(docenteService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Docente> actualizar(@RequestBody Docente docente){
        return ResponseEntity.ok(docenteService.actualizar((docente)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Docente>> eleminar(@PathVariable(required = true) Integer id){
        docenteService.eleminar(id);
        return ResponseEntity.ok(docenteService.lista());

    }
}
