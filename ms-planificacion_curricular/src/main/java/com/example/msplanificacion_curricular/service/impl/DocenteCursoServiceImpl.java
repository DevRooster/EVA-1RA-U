package com.example.msplanificacion_curricular.service.impl;


import com.example.msplanificacion_curricular.entity.DocenteCurso;
import com.example.msplanificacion_curricular.repository.DocenteCursoRepository;
import com.example.msplanificacion_curricular.service.DocenteCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteCursoServiceImpl implements DocenteCursoService {
    @Autowired
    private DocenteCursoRepository docenteCursoRepository;

    @Override
    public List<DocenteCurso> lista() {
        return docenteCursoRepository.findAll();
    }

    @Override
    public DocenteCurso guardar(DocenteCurso docenteCurso) {
        return docenteCursoRepository.save(docenteCurso);
    }

    @Override
    public Optional<DocenteCurso> buscarPorId(Integer id) {
        return docenteCursoRepository.findById(id);
    }

    @Override
    public DocenteCurso actualizar(DocenteCurso docenteCurso) {
        return docenteCursoRepository.save(docenteCurso);
    }

    @Override
    public void eleminar(Integer id) {
        docenteCursoRepository.deleteById(id);

    }
}
