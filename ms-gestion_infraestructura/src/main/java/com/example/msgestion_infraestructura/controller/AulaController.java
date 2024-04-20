package com.example.msgestion_infraestructura.controller;

import com.example.msgestion_infraestructura.entity.Aula;
import com.example.msgestion_infraestructura.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aula")
public class AulaController {
    @Autowired
    private AulaService aulaService;

    @GetMapping
    ResponseEntity<List<Aula>> lista(){
        return ResponseEntity.ok(aulaService.lista());
    }
    @PostMapping
    ResponseEntity<Aula> guardar(@RequestBody Aula aula) {
        return ResponseEntity.ok(aulaService.guardar((aula)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Aula> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(aulaService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Aula> actualizar(@RequestBody Aula aula){
        return ResponseEntity.ok(aulaService.actualizar((aula)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Aula>> eliminar(@PathVariable(required = true) Integer id){
        aulaService.eliminar(id);
        return ResponseEntity.ok(aulaService.lista());

    }
}
