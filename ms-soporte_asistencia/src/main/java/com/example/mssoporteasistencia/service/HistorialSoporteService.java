package com.example.mssoporteasistencia.service;


import com.example.mssoporteasistencia.entity.HistorialSoporte;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface HistorialSoporteService {
    List<HistorialSoporte> lista();
    HistorialSoporte guardar(HistorialSoporte historialSoporte);
    Optional<HistorialSoporte> buscarPorId(Integer id);
    HistorialSoporte actualizar(HistorialSoporte historialSoporte);
    void eleminar(Integer id);
}
