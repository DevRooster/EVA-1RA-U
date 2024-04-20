package com.example.msgestion_infraestructura.controller;

import com.example.msgestion_infraestructura.entity.Edificio;
import com.example.msgestion_infraestructura.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edificio")
public class EdificioController {

    @Autowired
    private EdificioService edificioService;

    @GetMapping
    ResponseEntity<List<Edificio>> lista(){
        return ResponseEntity.ok(edificioService.lista());
    }
    @PostMapping
    ResponseEntity<Edificio> guardar(@RequestBody Edificio edificio) {
        return ResponseEntity.ok(edificioService.guardar((edificio)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Edificio> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(edificioService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Edificio> actualizar(@RequestBody Edificio edificio){
        return ResponseEntity.ok(edificioService.actualizar((edificio)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Edificio>> eliminar(@PathVariable(required = true) Integer id){
        edificioService.eliminar(id);
        return ResponseEntity.ok(edificioService.lista());

    }
}
