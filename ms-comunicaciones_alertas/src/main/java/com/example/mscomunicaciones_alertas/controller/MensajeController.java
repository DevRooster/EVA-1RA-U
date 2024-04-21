package com.example.mscomunicaciones_alertas.controller;

import com.example.mscomunicaciones_alertas.entity.Mensaje;
import com.example.mscomunicaciones_alertas.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @GetMapping
    ResponseEntity<List<Mensaje>> lista(){
        return ResponseEntity.ok(mensajeService.lista());
    }
    @PostMapping
    ResponseEntity<Mensaje> guardar(@RequestBody Mensaje mensaje) {
        return ResponseEntity.ok(mensajeService.guardar((mensaje)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Mensaje> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(mensajeService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Mensaje> actualizar(@RequestBody Mensaje mensaje){
        return ResponseEntity.ok(mensajeService.actualizar((mensaje)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Mensaje>> eliminar(@PathVariable(required = true) Integer id){
        mensajeService.eliminar(id);
        return ResponseEntity.ok(mensajeService.lista());

    }
}
