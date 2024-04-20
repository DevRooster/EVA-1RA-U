package com.example.msinstitucion_externa.service;

import com.example.msinstitucion_externa.entity.DatosCompartidos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DatosCompartidosService {
    List<DatosCompartidos> lista();
    DatosCompartidos guardar(DatosCompartidos datosCompartidos);
    Optional<DatosCompartidos> buscarPorId(Integer id);
    DatosCompartidos actualizar(DatosCompartidos datosCompartidos);
    void eleminar(Integer id);
}
