package com.example.msgestion_eventos_actividades.service;

import com.example.msgestion_eventos_actividades.entity.Participante;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ParticipanteService {
    List<Participante> lista();
    Participante guardar(Participante participante);
    Optional<Participante> buscarPorId(Integer id);
    Participante actualizar(Participante participante);
    void eleminar(Integer id);
}
