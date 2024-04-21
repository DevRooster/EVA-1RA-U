package com.example.mscomunicaciones_alertas.service.impl;

import com.example.mscomunicaciones_alertas.entity.Grupo;
import com.example.mscomunicaciones_alertas.repository.GrupoRepository;
import com.example.mscomunicaciones_alertas.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoServiceImpl implements GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    @Override
    public List<Grupo> lista() {
        return grupoRepository.findAll();
    }

    @Override
    public Grupo guardar(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    @Override
    public Optional<Grupo> buscarPorId(Integer id) {
        return grupoRepository.findById(id);
    }

    @Override
    public Grupo actualizar(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    @Override
    public void eliminar(Integer id) {
        grupoRepository.deleteById(id);

    }
}
