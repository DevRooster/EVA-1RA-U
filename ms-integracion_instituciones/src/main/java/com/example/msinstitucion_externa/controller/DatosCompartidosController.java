package com.example.msinstitucion_externa.controller;

import com.example.msinstitucion_externa.entity.DatosCompartidos;
import com.example.msinstitucion_externa.service.DatosCompartidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datos_compartidos")
public class DatosCompartidosController {
    @Autowired
    private DatosCompartidosService datosCompartidosService;

    @GetMapping
    ResponseEntity<List<DatosCompartidos>> lista(){
        return ResponseEntity.ok(datosCompartidosService.lista());
    }
    @PostMapping
    ResponseEntity<DatosCompartidos> guardar(@RequestBody DatosCompartidos DatosCompartidos){
        return ResponseEntity.ok(datosCompartidosService.guardar((DatosCompartidos)));
    }

    @GetMapping("/{id}")
    ResponseEntity<DatosCompartidos> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(datosCompartidosService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<DatosCompartidos> actualizar(@RequestBody DatosCompartidos DatosCompartidos){
        return ResponseEntity.ok(datosCompartidosService.actualizar((DatosCompartidos)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<DatosCompartidos>> eleminar(@PathVariable(required = true) Integer id){
        datosCompartidosService.eleminar(id);
        return ResponseEntity.ok(datosCompartidosService.lista());

    }
}
