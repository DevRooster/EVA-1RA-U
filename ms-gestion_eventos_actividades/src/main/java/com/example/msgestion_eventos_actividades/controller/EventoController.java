package com.example.msgestion_eventos_actividades.controller;

import com.example.msgestion_eventos_actividades.entity.Evento;
import com.example.msgestion_eventos_actividades.service.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @GetMapping
    ResponseEntity<List<Evento>> lista(){
        return ResponseEntity.ok(eventoService.lista());
    }
    @PostMapping
    ResponseEntity<Evento> guardar(@RequestBody Evento evento){
        return ResponseEntity.ok(eventoService.guardar((evento)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Evento> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(eventoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Evento> actualizar(@RequestBody Evento evento){
        return ResponseEntity.ok(eventoService.actualizar((evento)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Evento>> eleminar(@PathVariable(required = true) Integer id){
        eventoService.eleminar(id);
        return ResponseEntity.ok(eventoService.lista());

    }
}
