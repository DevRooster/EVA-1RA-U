package com.example.mssoporteasistencia.service;


import com.example.mssoporteasistencia.entity.Incidente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface IncidenteService {
    List<Incidente> lista();
    Incidente guardar(Incidente incidente);
    Optional<Incidente> buscarPorId(Integer id);
    Incidente actualizar(Incidente incidente);
    void eleminar(Integer id);
}
