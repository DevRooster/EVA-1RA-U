package com.example.msgestion_eventos_actividades.service;

import com.example.msgestion_eventos_actividades.entity.Evento;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EventoService {
    List<Evento> lista();
    Evento guardar(Evento evento);
    Optional<Evento> buscarPorId(Integer id);
    Evento actualizar(Evento evento);
    void eleminar(Integer id);
}
