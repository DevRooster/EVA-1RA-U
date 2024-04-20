package com.example.msmonitoreo_asistencia.service.impl;

import com.example.msmonitoreo_asistencia.entity.Clase;
import com.example.msmonitoreo_asistencia.entity.Estudiante;
import com.example.msmonitoreo_asistencia.repository.EstudianteRepository;
import com.example.msmonitoreo_asistencia.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> lista() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Optional<Estudiante> buscarPorId(Integer id) {
        return estudianteRepository.findById(id);
    }

    @Override
    public Estudiante actualizar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void eleminar(Integer id) {
        estudianteRepository.deleteById(id);

    }
}
