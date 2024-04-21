package com.example.mscomunicaciones_alertas.service;

import com.example.mscomunicaciones_alertas.entity.Grupo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GrupoService {
    List<Grupo> lista();
    Grupo guardar(Grupo grupo);
    Optional<Grupo> buscarPorId(Integer id);
    Grupo actualizar(Grupo grupo);
    void eliminar(Integer id);
}
