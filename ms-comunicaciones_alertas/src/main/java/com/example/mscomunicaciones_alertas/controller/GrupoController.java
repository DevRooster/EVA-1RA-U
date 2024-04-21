package com.example.mscomunicaciones_alertas.controller;

import com.example.mscomunicaciones_alertas.entity.Grupo;
import com.example.mscomunicaciones_alertas.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @GetMapping
    ResponseEntity<List<Grupo>> lista(){
        return ResponseEntity.ok(grupoService.lista());
    }
    @PostMapping
    ResponseEntity<Grupo> guardar(@RequestBody Grupo grupo) {
        return ResponseEntity.ok(grupoService.guardar((grupo)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Grupo> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(grupoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Grupo> actualizar(@RequestBody Grupo grupo){
        return ResponseEntity.ok(grupoService.actualizar((grupo)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Grupo>> eliminar(@PathVariable(required = true) Integer id){
        grupoService.eliminar(id);
        return ResponseEntity.ok(grupoService.lista());

    }
}
