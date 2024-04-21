package com.example.mscapacitacion.controller;

import com.example.mscapacitacion.entity.Participante;
import com.example.mscapacitacion.service.ParticipanteService;
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
    public ResponseEntity<List<Participante>> listar() {
        return ResponseEntity.ok(participanteService.listar());
    }

    @PostMapping
    public ResponseEntity<Participante> guardar(@RequestBody Participante participante) {
        return ResponseEntity.ok(participanteService.guardar(participante));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Participante> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(participanteService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Participante> actualizar(@RequestBody Participante participante) {
        return ResponseEntity.ok(participanteService.actualizar(participante));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Participante>> eliminar(@PathVariable(required = true) Integer id) {
        participanteService.eliminar(id);
        return ResponseEntity.ok(participanteService.listar());
    }
}
