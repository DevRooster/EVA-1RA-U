package com.example.msplanificacion_curricular.service;


import com.example.msplanificacion_curricular.entity.PlanEstudios;

import java.util.List;
import java.util.Optional;

public interface PlanEstudiosService {
    List<PlanEstudios> lista();
    PlanEstudios guardar(PlanEstudios planEstudios);
    Optional<PlanEstudios> buscarPorId(Integer id);
    PlanEstudios actualizar(PlanEstudios planEstudios);
    void eleminar(Integer id);
}
