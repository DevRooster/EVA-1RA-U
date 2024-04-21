package com.example.msplanificacion_curricular.service.impl;


import com.example.msplanificacion_curricular.entity.ContenidoCurricular;
import com.example.msplanificacion_curricular.repository.ContenidoCurricularRepository;
import com.example.msplanificacion_curricular.service.ContenidoCurricularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContenidoCurricularServiceImpl implements ContenidoCurricularService {
    @Autowired
    private ContenidoCurricularRepository contenidoCurricularRepository;

    @Override
    public List<ContenidoCurricular> lista() {
        return contenidoCurricularRepository.findAll();
    }

    @Override
    public ContenidoCurricular guardar(ContenidoCurricular contenidoCurricular) {
        return contenidoCurricularRepository.save(contenidoCurricular);
    }

    @Override
    public Optional<ContenidoCurricular> buscarPorId(Integer id) {
        return contenidoCurricularRepository.findById(id);
    }

    @Override
    public ContenidoCurricular actualizar(ContenidoCurricular contenidoCurricular) {
        return contenidoCurricularRepository.save(contenidoCurricular);
    }

    @Override
    public void eleminar(Integer id) {
        contenidoCurricularRepository.deleteById(id);

    }
}
