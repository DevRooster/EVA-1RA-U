package com.example.msgestion_docentes.service.impl;


import com.example.msgestion_docentes.entity.Asignatura;
import com.example.msgestion_docentes.repository.AsignaturaRepository;
import com.example.msgestion_docentes.service.AsignaturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AsignaturaServiceImpl implements AsignaturaService {
    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Override
    public List<Asignatura> lista() {
        return asignaturaRepository.findAll();
    }

    @Override
    public Asignatura guardar(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public Optional<Asignatura> buscarPorId(Integer id) {
        return asignaturaRepository.findById(id);
    }

    @Override
    public Asignatura actualizar(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public void eleminar(Integer id) {
        asignaturaRepository.deleteById(id);

    }
}
