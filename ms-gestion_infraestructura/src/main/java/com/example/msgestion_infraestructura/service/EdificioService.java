package com.example.msgestion_infraestructura.service;

import com.example.msgestion_infraestructura.entity.Aula;
import com.example.msgestion_infraestructura.entity.Edificio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface EdificioService {
    List<Edificio> lista();
    Edificio guardar(Edificio edificio);
    Optional<Edificio> buscarPorId(Integer id);
    Edificio actualizar(Edificio edificio);
    void eliminar(Integer id);
}
