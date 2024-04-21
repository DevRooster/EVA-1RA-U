package com.example.msplanificacion_curricular.controller;




import com.example.msplanificacion_curricular.entity.ContenidoCurricular;
import com.example.msplanificacion_curricular.service.ContenidoCurricularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/contenido_curricular")
public class ContenidoCurricularController {
    @Autowired
    private ContenidoCurricularService contenidoCurricularService;

    @GetMapping
    ResponseEntity<List<ContenidoCurricular>> lista(){
        return ResponseEntity.ok(contenidoCurricularService.lista());
    }
    @PostMapping
    ResponseEntity<ContenidoCurricular> guardar(@RequestBody ContenidoCurricular contenidoCurricular) {
        return ResponseEntity.ok(contenidoCurricularService.guardar((contenidoCurricular)));
    }

    @GetMapping("/{id}")
    ResponseEntity<ContenidoCurricular> buscarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(contenidoCurricularService.buscarPorId(id).get());

    }

    @PutMapping
    ResponseEntity<ContenidoCurricular> actualizar(@RequestBody ContenidoCurricular contenidoCurricular){
        return ResponseEntity.ok(contenidoCurricularService.actualizar((contenidoCurricular)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<ContenidoCurricular>> eleminar(@PathVariable(required = true) Integer id){
        contenidoCurricularService.eleminar(id);
        return ResponseEntity.ok(contenidoCurricularService.lista());

    }
}
