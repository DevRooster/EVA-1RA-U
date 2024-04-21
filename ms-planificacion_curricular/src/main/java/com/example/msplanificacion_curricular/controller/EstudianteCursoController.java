package com.example.msplanificacion_curricular.controller;
import com.example.msplanificacion_curricular.entity.EstudianteCurso;
import com.example.msplanificacion_curricular.service.EstudianteCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante_curso")
public class EstudianteCursoController {
    @Autowired
    private EstudianteCursoService estudianteCursoService;

    @GetMapping
    ResponseEntity<List<EstudianteCurso>> lista(){
        return ResponseEntity.ok(estudianteCursoService.lista());
    }
    @PostMapping
    ResponseEntity<EstudianteCurso> guardar(@RequestBody EstudianteCurso estudianteCurso){
        return ResponseEntity.ok(estudianteCursoService.guardar((estudianteCurso)));
    }

    @GetMapping("/{id}")
    ResponseEntity<EstudianteCurso> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(estudianteCursoService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<EstudianteCurso> actualizar(@RequestBody EstudianteCurso estudianteCurso){
        return ResponseEntity.ok(estudianteCursoService.actualizar((estudianteCurso)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<EstudianteCurso>> eleminar(@PathVariable(required = true) Integer id){
        estudianteCursoService.eleminar(id);
        return ResponseEntity.ok(estudianteCursoService.lista());

    }
}
