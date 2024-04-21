package com.example.msgestion_eventos_actividades.service.impl;

import com.example.msgestion_eventos_actividades.entity.Evento;
import com.example.msgestion_eventos_actividades.repository.EventoRepository;
import com.example.msgestion_eventos_actividades.service.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoServiceImpl implements EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> lista() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento guardar(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public Optional<Evento> buscarPorId(Integer id) {
        return eventoRepository.findById(id);
    }

    @Override
    public Evento actualizar(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public void eleminar(Integer id) {
        eventoRepository.deleteById(id);

    }
}
