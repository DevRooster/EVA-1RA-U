package com.example.mscomunicaciones_alertas.service;

import com.example.mscomunicaciones_alertas.entity.Alerta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AlertaService {
    List<Alerta> lista();
    Alerta guardar(Alerta alerta);
    Optional<Alerta> buscarPorId(Integer id);
    Alerta actualizar(Alerta alerta);
    void eliminar(Integer id);
}
