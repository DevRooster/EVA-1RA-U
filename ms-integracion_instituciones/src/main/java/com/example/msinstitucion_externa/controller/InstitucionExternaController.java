package com.example.msinstitucion_externa.controller;

import com.example.msinstitucion_externa.entity.InstitucionExterna;
import com.example.msinstitucion_externa.service.InstitucionExternaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/institucion_externa")
public class InstitucionExternaController {
    @Autowired
    private InstitucionExternaService institucionExternaService;

    @GetMapping
    ResponseEntity<List<InstitucionExterna>> lista(){
        return ResponseEntity.ok(institucionExternaService.lista());
    }
    @PostMapping
    ResponseEntity<InstitucionExterna> guardar(@RequestBody InstitucionExterna institucionExterna){
        return ResponseEntity.ok(institucionExternaService.guardar((institucionExterna)));
    }

    @GetMapping("/{id}")
    ResponseEntity<InstitucionExterna> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(institucionExternaService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<InstitucionExterna> actualizar(@RequestBody InstitucionExterna institucionExterna){
        return ResponseEntity.ok(institucionExternaService.actualizar((institucionExterna)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<InstitucionExterna>> eleminar(@PathVariable(required = true) Integer id){
        institucionExternaService.eleminar(id);
        return ResponseEntity.ok(institucionExternaService.lista());

    }
}
