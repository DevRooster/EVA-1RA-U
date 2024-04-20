package com.example.msgestion_infraestructura.controller;

import com.example.msgestion_infraestructura.entity.Mantenimiento;
import com.example.msgestion_infraestructura.service.MantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {

    @Autowired
    private MantenimientoService mantenimientoService;

    @GetMapping
    ResponseEntity<List<Mantenimiento>> lista(){
        return ResponseEntity.ok(mantenimientoService.lista());
    }
    @PostMapping
    ResponseEntity<Mantenimiento> guardar(@RequestBody Mantenimiento mantenimiento) {
        return ResponseEntity.ok(mantenimientoService.guardar((mantenimiento)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Mantenimiento> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(mantenimientoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Mantenimiento> actualizar(@RequestBody Mantenimiento mantenimiento){
        return ResponseEntity.ok(mantenimientoService.actualizar((mantenimiento)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Mantenimiento>> eliminar(@PathVariable(required = true) Integer id){
        mantenimientoService.eliminar(id);
        return ResponseEntity.ok(mantenimientoService.lista());

    }
}
