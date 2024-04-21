package com.example.msplanificacion_curricular.service;


import com.example.msplanificacion_curricular.entity.EstudianteCurso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EstudianteCursoService {
    List<EstudianteCurso> lista();
    EstudianteCurso guardar(EstudianteCurso estudianteCurso);
    Optional<EstudianteCurso> buscarPorId(Integer id);
    EstudianteCurso actualizar(EstudianteCurso estudianteCurso);
    void eleminar(Integer id);
}
