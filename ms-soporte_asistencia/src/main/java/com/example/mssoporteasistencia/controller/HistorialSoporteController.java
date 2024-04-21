package com.example.mssoporteasistencia.controller;

import com.example.mssoporteasistencia.entity.HistorialSoporte;
import com.example.mssoporteasistencia.service.HistorialSoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/historialsoporte")
public class HistorialSoporteController {
    @Autowired
    private HistorialSoporteService historialSoporteService;

    @GetMapping
    ResponseEntity<List<HistorialSoporte>> lista(){
        return ResponseEntity.ok(historialSoporteService.lista());
    }
    @PostMapping
    ResponseEntity<HistorialSoporte> guardar(@RequestBody HistorialSoporte historialSoporte){
        return ResponseEntity.ok(historialSoporteService.guardar((historialSoporte)));
    }

    @GetMapping("/{id}")
    ResponseEntity<HistorialSoporte> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(historialSoporteService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<HistorialSoporte> actualizar(@RequestBody HistorialSoporte historialSoporte){
        return ResponseEntity.ok(historialSoporteService.actualizar((historialSoporte)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<HistorialSoporte>> eleminar(@PathVariable(required = true) Integer id){
        historialSoporteService.eleminar(id);
        return ResponseEntity.ok(historialSoporteService.lista());

    }
}
