package com.example.msgestion_eventos_actividades.controller;


import com.example.msgestion_eventos_actividades.entity.Actividad;
import com.example.msgestion_eventos_actividades.service.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actividad_evento")
public class ActividadController {
    @Autowired
    private ActividadService actividadService;

    @GetMapping
    ResponseEntity<List<Actividad>> lista(){
        return ResponseEntity.ok(actividadService.lista());
    }
    @PostMapping
    ResponseEntity<Actividad> guardar(@RequestBody Actividad actividad){
        return ResponseEntity.ok(actividadService.guardar((actividad)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Actividad> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(actividadService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Actividad> actualizar(@RequestBody Actividad actividad){
        return ResponseEntity.ok(actividadService.actualizar((actividad)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Actividad>> eleminar(@PathVariable(required = true) Integer id){
        actividadService.eleminar(id);
        return ResponseEntity.ok(actividadService.lista());

    }
}
