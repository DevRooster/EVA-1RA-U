package com.example.msgestion_financiera.service;

import com.example.msgestion_financiera.entity.Egreso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EgresoService {

    List<Egreso> lista();
    Egreso guardar(Egreso egreso);
    Optional<Egreso> buscarPorId(Integer id);
    Egreso actualizar(Egreso egreso);
    void eliminar(Integer id);
}
