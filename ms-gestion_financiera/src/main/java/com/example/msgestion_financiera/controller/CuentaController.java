package com.example.msgestion_financiera.controller;

import com.example.msgestion_financiera.entity.Cuenta;
import com.example.msgestion_financiera.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    ResponseEntity<List<Cuenta>> lista(){
        return ResponseEntity.ok(cuentaService.lista());
    }
    @PostMapping
    ResponseEntity<Cuenta> guardar(@RequestBody Cuenta cuenta) {
        return ResponseEntity.ok(cuentaService.guardar((cuenta)));
    }

    @GetMapping("/{id}")
    ResponseEntity<Cuenta> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(cuentaService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<Cuenta> actualizar(@RequestBody Cuenta cuenta){
        return ResponseEntity.ok(cuentaService.actualizar((cuenta)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Cuenta>> eliminar(@PathVariable(required = true) Integer id){
        cuentaService.eliminar(id);
        return ResponseEntity.ok(cuentaService.lista());

    }
}
