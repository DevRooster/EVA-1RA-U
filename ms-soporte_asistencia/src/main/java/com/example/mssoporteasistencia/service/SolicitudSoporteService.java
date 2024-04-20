package com.example.mssoporteasistencia.service;


import com.example.mssoporteasistencia.entity.SolicitudSoporte;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface SolicitudSoporteService {
    List<SolicitudSoporte> lista();
    SolicitudSoporte guardar(SolicitudSoporte solicitudSoporte);
    Optional<SolicitudSoporte> buscarPorId(Integer id);
    SolicitudSoporte actualizar(SolicitudSoporte solicitudSoporte);
    void eleminar(Integer id);
}
