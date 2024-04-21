package com.example.msplanificacion_curricular.service;


import com.example.msplanificacion_curricular.entity.ContenidoCurricular;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ContenidoCurricularService {
    List<ContenidoCurricular> lista();
    ContenidoCurricular guardar(ContenidoCurricular contenidoCurricular);
    Optional<ContenidoCurricular> buscarPorId(Integer id);
    ContenidoCurricular actualizar(ContenidoCurricular contenidoCurricular);
    void eleminar(Integer id);
}
