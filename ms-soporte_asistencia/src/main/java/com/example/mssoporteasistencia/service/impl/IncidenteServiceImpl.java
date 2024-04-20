package com.example.mssoporteasistencia.service.impl;


import com.example.mssoporteasistencia.entity.Incidente;
import com.example.mssoporteasistencia.repository.IncidenteRepository;
import com.example.mssoporteasistencia.service.IncidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IncidenteServiceImpl implements IncidenteService {
    @Autowired
    private IncidenteRepository incidenteRepository;

    @Override
    public List<Incidente> lista() {
        return incidenteRepository.findAll();
    }

    @Override
    public Incidente guardar(Incidente incidente) {
        return incidenteRepository.save(incidente);
    }

    @Override
    public Optional<Incidente> buscarPorId(Integer id) {
        return incidenteRepository.findById(id);
    }

    @Override
    public Incidente actualizar(Incidente incidente) {
        return incidenteRepository.save(incidente);
    }

    @Override
    public void eleminar(Integer id) {
        incidenteRepository.deleteById(id);

    }
}
