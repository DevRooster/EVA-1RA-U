package com.example.msmonitoreo_asistencia.controller;

import com.example.msmonitoreo_asistencia.entity.Clase;
import com.example.msmonitoreo_asistencia.entity.RegistroAsistencia;
import com.example.msmonitoreo_asistencia.service.ClaseService;
import com.example.msmonitoreo_asistencia.service.RegistroAsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clase")
public class ClaseController {
    @Autowired
    private ClaseService claseService;

    @GetMapping
    ResponseEntity<List<Clase>> lista(){
        return ResponseEntity.ok(claseService.lista());
    }
    @PostMapping
    ResponseEntity<Clase> guardar(@RequestBody Clase clase) {
        return ResponseEntity.ok(claseService.guardar((clase)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Clase> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(claseService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Clase> actualizar(@RequestBody Clase clase){
        return ResponseEntity.ok(claseService.actualizar((clase)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Clase>> eleminar(@PathVariable(required = true) Integer id){
        claseService.eleminar(id);
        return ResponseEntity.ok(claseService.lista());

    }
}
