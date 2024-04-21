package com.example.msplanificacion_curricular.service;


import com.example.msplanificacion_curricular.entity.DocenteCurso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DocenteCursoService {
    List<DocenteCurso> lista();
    DocenteCurso guardar(DocenteCurso docenteCurso);
    Optional<DocenteCurso> buscarPorId(Integer id);
    DocenteCurso actualizar(DocenteCurso docenteCurso);
    void eleminar(Integer id);
}
