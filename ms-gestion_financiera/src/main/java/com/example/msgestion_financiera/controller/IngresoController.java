package com.example.msgestion_financiera.controller;

import com.example.msgestion_financiera.entity.Ingreso;
import com.example.msgestion_financiera.service.IngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {

    @Autowired
    private IngresoService ingresoService;

    @GetMapping
    ResponseEntity<List<Ingreso>> lista(){
        return ResponseEntity.ok(ingresoService.lista());
    }
    @PostMapping
    ResponseEntity<Ingreso> guardar(@RequestBody Ingreso ingreso) {
        return ResponseEntity.ok(ingresoService.guardar((ingreso)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Ingreso> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(ingresoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Ingreso> actualizar(@RequestBody Ingreso ingreso){
        return ResponseEntity.ok(ingresoService.actualizar((ingreso)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Ingreso>> eliminar(@PathVariable(required = true) Integer id){
        ingresoService.eliminar(id);
        return ResponseEntity.ok(ingresoService.lista());

    }
}
