package com.example.msgestion_docentes.service.impl;


import com.example.msgestion_docentes.entity.Docente;
import com.example.msgestion_docentes.repository.DocenteRepository;
import com.example.msgestion_docentes.service.DocenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DocenteServiceImpl implements DocenteService {
    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> lista() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente guardar(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Optional<Docente> buscarPorId(Integer id) {
        return docenteRepository.findById(id);
    }

    @Override
    public Docente actualizar(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void eleminar(Integer id) {
        docenteRepository.deleteById(id);

    }
}
