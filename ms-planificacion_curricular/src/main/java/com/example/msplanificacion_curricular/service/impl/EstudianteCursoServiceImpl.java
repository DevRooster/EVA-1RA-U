package com.example.msplanificacion_curricular.service.impl;

import com.example.msplanificacion_curricular.entity.EstudianteCurso;
import com.example.msplanificacion_curricular.repository.EstudianteCursoRepository;
import com.example.msplanificacion_curricular.service.EstudianteCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteCursoServiceImpl implements EstudianteCursoService {
    @Autowired
    private EstudianteCursoRepository estudianteCursoRepository;

    @Override
    public List<EstudianteCurso> lista() {
        return estudianteCursoRepository.findAll();
    }

    @Override
    public EstudianteCurso guardar(EstudianteCurso estudianteCurso) {
        return estudianteCursoRepository.save(estudianteCurso);
    }

    @Override
    public Optional<EstudianteCurso> buscarPorId(Integer id) {
        return estudianteCursoRepository.findById(id);
    }

    @Override
    public EstudianteCurso actualizar(EstudianteCurso estudianteCurso) {
        return estudianteCursoRepository.save(estudianteCurso);
    }

    @Override
    public void eleminar(Integer id) {
        estudianteCursoRepository.deleteById(id);

    }
}
