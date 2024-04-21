package com.example.msgestion_financiera.service;

import com.example.msgestion_financiera.entity.Cuenta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CuentaService {
    List<Cuenta> lista();
    Cuenta guardar(Cuenta cuenta);
    Optional<Cuenta> buscarPorId(Integer id);
    Cuenta actualizar(Cuenta cuenta);
    void eliminar(Integer id);
}
