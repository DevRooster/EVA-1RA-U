package com.example.msgestion_eventos_actividades.service;

import com.example.msgestion_eventos_actividades.entity.Actividad;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ActividadService {
    List<Actividad> lista();
    Actividad guardar(Actividad actividad);
    Optional<Actividad> buscarPorId(Integer id);
    Actividad actualizar(Actividad actividad);
    void eleminar(Integer id);
}
