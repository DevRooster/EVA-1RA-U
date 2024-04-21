package com.example.msinstitucion_externa.controller;

import com.example.msinstitucion_externa.entity.OtraUGEL;
import com.example.msinstitucion_externa.service.OtraUGELService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/otra_ugel")
public class OtraUGELController {
    @Autowired
    private OtraUGELService otraUGELService;

    @GetMapping
    ResponseEntity<List<OtraUGEL>> lista(){
        return ResponseEntity.ok(otraUGELService.lista());
    }
    @PostMapping
    ResponseEntity<OtraUGEL> guardar(@RequestBody OtraUGEL pedido){
        return ResponseEntity.ok(otraUGELService.guardar((pedido)));
    }

    @GetMapping("/{id}")
    ResponseEntity<OtraUGEL> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(otraUGELService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<OtraUGEL> actualizar(@RequestBody OtraUGEL pedido){
        return ResponseEntity.ok(otraUGELService.actualizar((pedido)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<OtraUGEL>> eleminar(@PathVariable(required = true) Integer id){
        otraUGELService.eleminar(id);
        return ResponseEntity.ok(otraUGELService.lista());

    }
}
