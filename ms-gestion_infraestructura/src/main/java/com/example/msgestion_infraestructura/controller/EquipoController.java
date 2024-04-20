package com.example.msgestion_infraestructura.controller;

import com.example.msgestion_infraestructura.entity.Equipo;
import com.example.msgestion_infraestructura.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping
    ResponseEntity<List<Equipo>> lista(){
        return ResponseEntity.ok(equipoService.lista());
    }
    @PostMapping
    ResponseEntity<Equipo> guardar(@RequestBody Equipo equipo) {
        return ResponseEntity.ok(equipoService.guardar((equipo)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Equipo> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(equipoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Equipo> actualizar(@RequestBody Equipo equipo){
        return ResponseEntity.ok(equipoService.actualizar((equipo)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Equipo>> eliminar(@PathVariable(required = true) Integer id){
        equipoService.eliminar(id);
        return ResponseEntity.ok(equipoService.lista());

    }

}
