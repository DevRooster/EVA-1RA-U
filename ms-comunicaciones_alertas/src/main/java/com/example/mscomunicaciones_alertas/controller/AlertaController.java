package com.example.mscomunicaciones_alertas.controller;

import com.example.mscomunicaciones_alertas.entity.Alerta;
import com.example.mscomunicaciones_alertas.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerta")
public class AlertaController {

    @Autowired
    private AlertaService alertaService;

    @GetMapping
    ResponseEntity<List<Alerta>> lista(){
        return ResponseEntity.ok(alertaService.lista());
    }
    @PostMapping
    ResponseEntity<Alerta> guardar(@RequestBody Alerta alerta) {
        return ResponseEntity.ok(alertaService.guardar((alerta)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Alerta> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(alertaService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Alerta> actualizar(@RequestBody Alerta alerta){
        return ResponseEntity.ok(alertaService.actualizar((alerta)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Alerta>> eliminar(@PathVariable(required = true) Integer id){
        alertaService.eliminar(id);
        return ResponseEntity.ok(alertaService.lista());

    }
}
