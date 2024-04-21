package com.example.mscapacitacion.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mscapacitacion.entity.Participante;
import com.example.mscapacitacion.repository.ParticipanteRepository;
import com.example.mscapacitacion.service.ParticipanteService;

@Service
public class ParticipanteServiceImpl implements ParticipanteService{
    @Autowired
    private ParticipanteRepository participanteRepository;

    @Override
    public List<Participante> listar() {
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
    public void eliminar(Integer id) {
        participanteRepository.deleteById(id);
    }
}
