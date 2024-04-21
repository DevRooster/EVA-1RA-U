package com.example.msgestion_docentes.controller;

import com.example.msgestion_docentes.entity.Evaluación;
import com.example.msgestion_docentes.service.EvaluaciónService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/evaluación")
public class EvaluaciónController {
    @Autowired
    private EvaluaciónService evaluaciónService;

    @GetMapping
    ResponseEntity<List<Evaluación>> lista(){
        return ResponseEntity.ok(evaluaciónService.lista());
    }
    @PostMapping
    ResponseEntity<Evaluación> guardar(@RequestBody Evaluación evaluación){
        return ResponseEntity.ok(evaluaciónService.guardar((evaluación)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Evaluación> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(evaluaciónService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Evaluación> actualizar(@RequestBody Evaluación evaluación){
        return ResponseEntity.ok(evaluaciónService.actualizar((evaluación)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Evaluación>> eleminar(@PathVariable(required = true) Integer id){
        evaluaciónService.eleminar(id);
        return ResponseEntity.ok(evaluaciónService.lista());

    }
}
