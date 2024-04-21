package com.example.msgestion_eventos_actividades.service.impl;

import com.example.msgestion_eventos_actividades.entity.RecursoNecesario;
import com.example.msgestion_eventos_actividades.repository.RecursoNecesarioRespository;
import com.example.msgestion_eventos_actividades.service.RecursoNecesarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecursoNecesarioServiceImpl implements RecursoNecesarioService {
    @Autowired
    private RecursoNecesarioRespository recursoNecesarioRespository;

    @Override
    public List<RecursoNecesario> lista() {
        return recursoNecesarioRespository.findAll();
    }

    @Override
    public RecursoNecesario guardar(RecursoNecesario recursoNecesario) {
        return recursoNecesarioRespository.save(recursoNecesario);
    }

    @Override
    public Optional<RecursoNecesario> buscarPorId(Integer id) {
        return recursoNecesarioRespository.findById(id);
    }

    @Override
    public RecursoNecesario actualizar(RecursoNecesario recursoNecesario) {
        return recursoNecesarioRespository.save(recursoNecesario);
    }

    @Override
    public void eleminar(Integer id) {
        recursoNecesarioRespository.deleteById(id);

    }
}
