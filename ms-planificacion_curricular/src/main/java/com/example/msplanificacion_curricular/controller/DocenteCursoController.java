package com.example.msplanificacion_curricular.controller;



import com.example.msplanificacion_curricular.entity.DocenteCurso;
import com.example.msplanificacion_curricular.service.DocenteCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docente_curso")
public class DocenteCursoController {
    @Autowired
    private DocenteCursoService docenteCursoService;

    @GetMapping
    ResponseEntity<List<DocenteCurso>> lista(){
        return ResponseEntity.ok(docenteCursoService.lista());
    }
    @PostMapping
    ResponseEntity<DocenteCurso> guardar(@RequestBody DocenteCurso docenteCurso) {
        return ResponseEntity.ok(docenteCursoService.guardar((docenteCurso)));
    }

    @GetMapping("/{id}")
    ResponseEntity<DocenteCurso> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(docenteCursoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<DocenteCurso> actualizar(@RequestBody DocenteCurso docenteCurso){
        return ResponseEntity.ok(docenteCursoService.actualizar((docenteCurso)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<DocenteCurso>> eleminar(@PathVariable(required = true) Integer id){
        docenteCursoService.eleminar(id);
        return ResponseEntity.ok(docenteCursoService.lista());

    }
}
