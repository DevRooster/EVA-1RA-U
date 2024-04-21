package com.example.msgestion_docentes.service;


import com.example.msgestion_docentes.entity.Docente;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface DocenteService {
    List<Docente> lista();
    Docente guardar(Docente docente);
    Optional<Docente> buscarPorId(Integer id);
    Docente actualizar(Docente docente);
    void eleminar(Integer id);
}
