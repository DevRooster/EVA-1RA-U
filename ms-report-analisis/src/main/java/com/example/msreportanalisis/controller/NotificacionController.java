package com.example.msreportanalisis.controller;

import com.example.msreportanalisis.entity.Notificacion;
import com.example.msreportanalisis.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
    @Autowired
    private NotificacionService notificacionService;

    @GetMapping
    public ResponseEntity<List<Notificacion>> listar() {
        return ResponseEntity.ok(notificacionService.listar());
    }

    @PostMapping
    public ResponseEntity<Notificacion> guardar(@RequestBody Notificacion notificacion) {
        return ResponseEntity.ok(notificacionService.guardar(notificacion));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notificacion> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(notificacionService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Notificacion> actualizar(@RequestBody Notificacion notificacion) {
        return ResponseEntity.ok(notificacionService.actualizar(notificacion));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Notificacion>> eliminar(@PathVariable(required = true) Integer id) {
        notificacionService.eliminar(id);
        return ResponseEntity.ok(notificacionService.listar());
    }
}
