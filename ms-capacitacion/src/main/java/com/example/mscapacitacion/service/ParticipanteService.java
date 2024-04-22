package com.example.mscapacitacion.service;

import com.example.mscapacitacion.entity.Participante;
import java.util.List;
import java.util.Optional;

public interface ParticipanteService {
    public List<Participante> listar();
    
    public Participante guardar(Participante participante);

    public Optional<Participante> buscarPorId(Integer id);

    public Participante actualizar(Participante participante);

    public void eliminar(Integer id);
}
