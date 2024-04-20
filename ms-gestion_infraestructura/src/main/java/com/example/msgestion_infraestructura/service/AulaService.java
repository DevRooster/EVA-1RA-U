package com.example.msgestion_infraestructura.service;

import com.example.msgestion_infraestructura.entity.Aula;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface AulaService {
    List<Aula> lista();
    Aula guardar(Aula aula);
    Optional<Aula> buscarPorId(Integer id);
    Aula actualizar(Aula aula);
    void eliminar(Integer id);
}
