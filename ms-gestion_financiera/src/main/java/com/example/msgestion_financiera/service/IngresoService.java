package com.example.msgestion_financiera.service;

import com.example.msgestion_financiera.entity.Ingreso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IngresoService {

    List<Ingreso> lista();
    Ingreso guardar(Ingreso ingreso);
    Optional<Ingreso> buscarPorId(Integer id);
    Ingreso actualizar(Ingreso ingreso);
    void eliminar(Integer id);
}
