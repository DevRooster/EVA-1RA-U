package com.example.mssoporteasistencia.controller;


import com.example.mssoporteasistencia.entity.Incidente;
import com.example.mssoporteasistencia.service.IncidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/incidente")
public class IncidenteController {
    @Autowired
    private IncidenteService incidenteService;

    @GetMapping
    ResponseEntity<List<Incidente>> lista(){
        return ResponseEntity.ok(incidenteService.lista());
    }
    @PostMapping
    ResponseEntity<Incidente> guardar(@RequestBody Incidente incidente) {
        return ResponseEntity.ok(incidenteService.guardar((incidente)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Incidente> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(incidenteService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Incidente> actualizar(@RequestBody Incidente incidente){
        return ResponseEntity.ok(incidenteService.actualizar((incidente)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Incidente>> eleminar(@PathVariable(required = true) Integer id){
        incidenteService.eleminar(id);
        return ResponseEntity.ok(incidenteService.lista());

    }
}
