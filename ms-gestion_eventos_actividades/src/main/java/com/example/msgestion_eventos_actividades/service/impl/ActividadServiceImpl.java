package com.example.msgestion_eventos_actividades.service.impl;

import com.example.msgestion_eventos_actividades.entity.Actividad;
import com.example.msgestion_eventos_actividades.repository.ActividadRepository;
import com.example.msgestion_eventos_actividades.service.ActividadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadServiceImpl implements ActividadService {
    @Autowired
    private ActividadRepository actividadRepository;

    @Override
    public List<Actividad> lista() {
        return actividadRepository.findAll();
    }

    @Override
    public Actividad guardar(Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    @Override
    public Optional<Actividad> buscarPorId(Integer id) {
        return actividadRepository.findById(id);
    }

    @Override
    public Actividad actualizar(Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    @Override
    public void eleminar(Integer id) {
        actividadRepository.deleteById(id);

    }
}
