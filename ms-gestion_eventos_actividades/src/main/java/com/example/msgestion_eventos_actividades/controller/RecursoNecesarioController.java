package com.example.msgestion_eventos_actividades.controller;

import com.example.msgestion_eventos_actividades.entity.RecursoNecesario;
import com.example.msgestion_eventos_actividades.service.RecursoNecesarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/recurso_necesarios")
public class RecursoNecesarioController {
    @Autowired
    private RecursoNecesarioService recursoNecesarioService;

    @GetMapping
    ResponseEntity<List<RecursoNecesario>> lista(){
        return ResponseEntity.ok(recursoNecesarioService.lista());
    }
    @PostMapping
    ResponseEntity<RecursoNecesario> guardar(@RequestBody RecursoNecesario recursoNecesario){
        return ResponseEntity.ok(recursoNecesarioService.guardar((recursoNecesario)));
    }

    @GetMapping("/{id}")
    ResponseEntity<RecursoNecesario> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(recursoNecesarioService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<RecursoNecesario> actualizar(@RequestBody RecursoNecesario recursoNecesario){
        return ResponseEntity.ok(recursoNecesarioService.actualizar((recursoNecesario)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<RecursoNecesario>> eleminar(@PathVariable(required = true) Integer id){
        recursoNecesarioService.eleminar(id);
        return ResponseEntity.ok(recursoNecesarioService.lista());

    }
}
