package com.example.msgestion_eventos_actividades.service;

import com.example.msgestion_eventos_actividades.entity.RecursoNecesario;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RecursoNecesarioService {
    List<RecursoNecesario> lista();
    RecursoNecesario guardar(RecursoNecesario recursoNecesario);
    Optional<RecursoNecesario> buscarPorId(Integer id);
    RecursoNecesario actualizar(RecursoNecesario recursoNecesario);
    void eleminar(Integer id);
}
