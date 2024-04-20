package com.example.msmonitoreo_asistencia.service.impl;

import com.example.msmonitoreo_asistencia.entity.Clase;
import com.example.msmonitoreo_asistencia.repository.ClaseRepository;
import com.example.msmonitoreo_asistencia.service.ClaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClaseServiceImpl implements ClaseService {
    @Autowired
    private ClaseRepository claseRepository;

    @Override
    public List<Clase> lista() {
        return claseRepository.findAll();
    }

    @Override
    public Clase guardar(Clase clase) {
        return claseRepository.save(clase);
    }

    @Override
    public Optional<Clase> buscarPorId(Integer id) {
        return claseRepository.findById(id);
    }

    @Override
    public Clase actualizar(Clase clase) {
        return claseRepository.save(clase);
    }

    @Override
    public void eleminar(Integer id) {
        claseRepository.deleteById(id);

    }
}
