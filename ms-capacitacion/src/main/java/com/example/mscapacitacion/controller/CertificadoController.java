package com.example.mscapacitacion.controller;

import com.example.mscapacitacion.entity.Certificado;
import com.example.mscapacitacion.service.CertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/certificado")
public class CertificadoController {
    @Autowired
    private CertificadoService certificadoService;

    @GetMapping
    public ResponseEntity<List<Certificado>> listar() {
        return ResponseEntity.ok(certificadoService.listar());
    }

    @PostMapping
    public ResponseEntity<Certificado> guardar(@RequestBody Certificado certificado) {
        return ResponseEntity.ok(certificadoService.guardar(certificado));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certificado> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(certificadoService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Certificado> actualizar(@RequestBody Certificado certificado) {
        return ResponseEntity.ok(certificadoService.actualizar(certificado));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Certificado>> eliminar(@PathVariable(required = true) Integer id) {
        certificadoService.eliminar(id);
        return ResponseEntity.ok(certificadoService.listar());
    }
}
