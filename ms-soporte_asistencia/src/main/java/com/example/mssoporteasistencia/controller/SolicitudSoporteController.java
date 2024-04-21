package com.example.mssoporteasistencia.controller;


import com.example.mssoporteasistencia.entity.SolicitudSoporte;
import com.example.mssoporteasistencia.service.SolicitudSoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/solicitud_soporte")
public class SolicitudSoporteController {
    @Autowired
    private SolicitudSoporteService solicitudSoporteService;

    @GetMapping
    ResponseEntity<List<SolicitudSoporte>> lista(){
        return ResponseEntity.ok(solicitudSoporteService.lista());
    }
    @PostMapping
    ResponseEntity<SolicitudSoporte> guardar(@RequestBody SolicitudSoporte clase) {
        return ResponseEntity.ok(solicitudSoporteService.guardar((clase)));
    }

    @GetMapping("/{id}")
    ResponseEntity<SolicitudSoporte> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(solicitudSoporteService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<SolicitudSoporte> actualizar(@RequestBody SolicitudSoporte solicitudSoporte){
        return ResponseEntity.ok(solicitudSoporteService.actualizar((solicitudSoporte)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<SolicitudSoporte>> eleminar(@PathVariable(required = true) Integer id){
        solicitudSoporteService.eleminar(id);
        return ResponseEntity.ok(solicitudSoporteService.lista());

    }
}
