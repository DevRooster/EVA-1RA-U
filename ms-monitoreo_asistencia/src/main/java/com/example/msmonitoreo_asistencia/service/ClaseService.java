package com.example.msmonitoreo_asistencia.service;

import com.example.msmonitoreo_asistencia.entity.Clase;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ClaseService {
    List<Clase> lista();
    Clase guardar(Clase clase);
    Optional<Clase> buscarPorId(Integer id);
    Clase actualizar(Clase clase);
    void eleminar(Integer id);
}
