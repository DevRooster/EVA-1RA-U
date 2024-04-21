package com.example.mscomunicaciones_alertas.service;

import com.example.mscomunicaciones_alertas.entity.Mensaje;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MensajeService {
    List<Mensaje> lista();
    Mensaje guardar(Mensaje mensaje);
    Optional<Mensaje> buscarPorId(Integer id);
    Mensaje actualizar(Mensaje mensaje);
    void eliminar(Integer id);
}
