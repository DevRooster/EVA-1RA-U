package com.example.msgestion_docentes.service;


import com.example.msgestion_docentes.entity.Asignatura;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AsignaturaService {
    List<Asignatura> lista();
    Asignatura guardar(Asignatura asignatura);
    Optional<Asignatura> buscarPorId(Integer id);
    Asignatura actualizar(Asignatura asignatura);
    void eleminar(Integer id);
}
