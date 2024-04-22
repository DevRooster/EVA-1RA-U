package com.example.msadmatricula.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.msadmatricula.entity.Curso;
import com.example.msadmatricula.repository.CursoRepository;
import com.example.msadmatricula.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Optional<Curso> buscarPorId(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso actualizar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void eliminar(Integer id) {
        cursoRepository.deleteById(id);
    }
}
