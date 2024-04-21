package com.example.mscomunicaciones_alertas.controller;

import com.example.mscomunicaciones_alertas.entity.MiembroGrupo;
import com.example.mscomunicaciones_alertas.service.MiembroGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/miembro_grupo")
public class MiembroGrupoController {

    @Autowired
    private MiembroGrupoService miembroGrupoService;

    @GetMapping
    ResponseEntity<List<MiembroGrupo>> lista(){
        return ResponseEntity.ok(miembroGrupoService.lista());
    }
    @PostMapping
    ResponseEntity<MiembroGrupo> guardar(@RequestBody MiembroGrupo miembroGrupo) {
        return ResponseEntity.ok(miembroGrupoService.guardar((miembroGrupo)));
    }

    @GetMapping("/{id}")
    ResponseEntity<MiembroGrupo> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(miembroGrupoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<MiembroGrupo> actualizar(@RequestBody MiembroGrupo miembroGrupo){
        return ResponseEntity.ok(miembroGrupoService.actualizar((miembroGrupo)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<MiembroGrupo>> eliminar(@PathVariable(required = true) Integer id){
        miembroGrupoService.eliminar(id);
        return ResponseEntity.ok(miembroGrupoService.lista());

    }
}
