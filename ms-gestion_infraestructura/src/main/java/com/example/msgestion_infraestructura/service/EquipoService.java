package com.example.msgestion_infraestructura.service;

import com.example.msgestion_infraestructura.entity.Aula;
import com.example.msgestion_infraestructura.entity.Equipo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface EquipoService {
    List<Equipo> lista();
    Equipo guardar(Equipo equipo);
    Optional<Equipo> buscarPorId(Integer id);
    Equipo actualizar(Equipo equipo);
    void eliminar(Integer id);
}
