package com.example.msgestion_financiera.controller;

import com.example.msgestion_financiera.entity.Egreso;
import com.example.msgestion_financiera.service.EgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/egreso")
public class EgresoController {

    @Autowired
    private EgresoService egresoService;

    @GetMapping
    ResponseEntity<List<Egreso>> lista(){
        return ResponseEntity.ok(egresoService.lista());
    }
    @PostMapping
    ResponseEntity<Egreso> guardar(@RequestBody Egreso egreso) {
        return ResponseEntity.ok(egresoService.guardar((egreso)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Egreso> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(egresoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Egreso> actualizar(@RequestBody Egreso egreso){
        return ResponseEntity.ok(egresoService.actualizar((egreso)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Egreso>> eliminar(@PathVariable(required = true) Integer id){
        egresoService.eliminar(id);
        return ResponseEntity.ok(egresoService.lista());

    }
}
