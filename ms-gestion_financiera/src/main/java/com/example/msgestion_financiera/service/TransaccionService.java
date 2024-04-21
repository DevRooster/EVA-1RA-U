package com.example.msgestion_financiera.service;

import com.example.msgestion_financiera.entity.Transaccion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TransaccionService {

    List<Transaccion> lista();
    Transaccion guardar(Transaccion transaccion);
    Optional<Transaccion> buscarPorId(Integer id);
    Transaccion actualizar(Transaccion transaccion);
    void eliminar(Integer id);
}
