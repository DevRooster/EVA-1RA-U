package com.example.msgestion_infraestructura.service;

import com.example.msgestion_infraestructura.entity.Aula;
import com.example.msgestion_infraestructura.entity.Mantenimiento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface MantenimientoService {
    List<Mantenimiento> lista();
    Mantenimiento guardar(Mantenimiento mantenimiento);
    Optional<Mantenimiento> buscarPorId(Integer id);
    Mantenimiento actualizar(Mantenimiento mantenimiento);
    void eliminar(Integer id);
}
