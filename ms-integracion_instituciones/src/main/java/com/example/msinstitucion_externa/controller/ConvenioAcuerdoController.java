package com.example.msinstitucion_externa.controller;

import com.example.msinstitucion_externa.entity.ConvenioAcuerdo;
import com.example.msinstitucion_externa.service.ConvenioAcuerdoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/convenio_acuerdo")
public class ConvenioAcuerdoController {
    @Autowired
    private ConvenioAcuerdoService convenioAcuerdoService;

    @GetMapping
    ResponseEntity<List<ConvenioAcuerdo>> lista(){
        return ResponseEntity.ok(convenioAcuerdoService.lista());
    }
    @PostMapping
    ResponseEntity<ConvenioAcuerdo> guardar(@RequestBody ConvenioAcuerdo convenioAcuerdo){
        return ResponseEntity.ok(convenioAcuerdoService.guardar((convenioAcuerdo)));
    }

    @GetMapping("/{id}")
    ResponseEntity<ConvenioAcuerdo> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(convenioAcuerdoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<ConvenioAcuerdo> actualizar(@RequestBody ConvenioAcuerdo convenioAcuerdo){
        return ResponseEntity.ok(convenioAcuerdoService.actualizar((convenioAcuerdo)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<ConvenioAcuerdo>> eleminar(@PathVariable(required = true) Integer id){
        convenioAcuerdoService.eleminar(id);
        return ResponseEntity.ok(convenioAcuerdoService.lista());

    }
}
