package com.example.msgestion_eventos_actividades.controller;

import com.example.msgestion_eventos_actividades.entity.Participante;
import com.example.msgestion_eventos_actividades.service.ParticipanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participante")
public class ParticipanteController {
    @Autowired
    private ParticipanteService participanteService;

    @GetMapping
    ResponseEntity<List<Participante>> lista(){
        return ResponseEntity.ok(participanteService.lista());
    }
    @PostMapping
    ResponseEntity<Participante> guardar(@RequestBody Participante participante){
        return ResponseEntity.ok(participanteService.guardar((participante)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Participante> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(participanteService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Participante> actualizar(@RequestBody Participante participante){
        return ResponseEntity.ok(participanteService.actualizar((participante)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Participante>> eleminar(@PathVariable(required = true) Integer id){
        participanteService.eleminar(id);
        return ResponseEntity.ok(participanteService.lista());

    }
}
