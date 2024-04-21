package com.example.msgestion_eventos_actividades.service.impl;

import com.example.msgestion_eventos_actividades.entity.Participante;
import com.example.msgestion_eventos_actividades.repository.ParticipanteRepository;
import com.example.msgestion_eventos_actividades.service.ParticipanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteServiceImpl implements ParticipanteService {
    @Autowired
    private ParticipanteRepository participanteRepository;

    @Override
    public List<Participante> lista() {
        return participanteRepository.findAll();
    }

    @Override
    public Participante guardar(Participante participante) {
        return participanteRepository.save(participante);
    }

    @Override
    public Optional<Participante> buscarPorId(Integer id) {
        return participanteRepository.findById(id);
    }

    @Override
    public Participante actualizar(Participante participante) {
        return participanteRepository.save(participante);
    }

    @Override
    public void eleminar(Integer id) {
        participanteRepository.deleteById(id);

    }
}
