package com.example.msgestion_infraestructura.service.impl;

import com.example.msgestion_infraestructura.entity.Aula;
import com.example.msgestion_infraestructura.repository.AulaRepository;
import com.example.msgestion_infraestructura.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaServiceImpl implements AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    @Override
    public List<Aula> lista() {
        return aulaRepository.findAll();
    }

    @Override
    public Aula guardar(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public Optional<Aula> buscarPorId(Integer id) {
        return aulaRepository.findById(id);
    }

    @Override
    public Aula actualizar(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public void eliminar(Integer id) {
        aulaRepository.deleteById(id);

    }

}
