package com.example.mscapacitacion.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mscapacitacion.entity.CapCurso;
import com.example.mscapacitacion.repository.CapCursoRepository;
import com.example.mscapacitacion.service.CapCursoService;

@Service
public class CapCursoServiceImpl implements CapCursoService{
    @Autowired
    private CapCursoRepository capcursoRepository;

    @Override
    public List<CapCurso> listar() {
        return capcursoRepository.findAll();
    }

    @Override
    public CapCurso guardar(CapCurso capcurso) {
        return capcursoRepository.save(capcurso);
    }

    @Override
    public Optional<CapCurso> buscarPorId(Integer id) {
        return capcursoRepository.findById(id);
    }

    @Override
    public CapCurso actualizar(CapCurso capcurso) {
        return capcursoRepository.save(capcurso);
    }

    @Override
    public void eliminar(Integer id) {
        capcursoRepository.deleteById(id);
    }
}
