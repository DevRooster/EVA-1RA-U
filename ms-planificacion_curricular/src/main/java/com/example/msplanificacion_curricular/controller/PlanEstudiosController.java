package com.example.msplanificacion_curricular.controller;


import com.example.msplanificacion_curricular.entity.PlanEstudios;
import com.example.msplanificacion_curricular.service.PlanEstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/plan_estudios")
public class PlanEstudiosController {
    @Autowired
    private PlanEstudiosService planEstudiosService;

    @GetMapping
    ResponseEntity<List<PlanEstudios>> lista(){
        return ResponseEntity.ok(planEstudiosService.lista());
    }
    @PostMapping
    ResponseEntity<PlanEstudios> guardar(@RequestBody PlanEstudios planEstudios){
        return ResponseEntity.ok(planEstudiosService.guardar((planEstudios)));
    }

    @GetMapping("/{id}")
    ResponseEntity<PlanEstudios> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(planEstudiosService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<PlanEstudios> actualizar(@RequestBody PlanEstudios planEstudios){
        return ResponseEntity.ok(planEstudiosService.actualizar((planEstudios)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<PlanEstudios>> eleminar(@PathVariable(required = true) Integer id){
        planEstudiosService.eleminar(id);
        return ResponseEntity.ok(planEstudiosService.lista());

    }
}
