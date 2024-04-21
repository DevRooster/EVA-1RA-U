package com.example.msgestion_financiera.service.impl;

import com.example.msgestion_financiera.entity.Transaccion;
import com.example.msgestion_financiera.repository.TransaccionRepository;
import com.example.msgestion_financiera.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransaccionServiceImpl implements TransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public List<Transaccion> lista() {
        return transaccionRepository.findAll();
    }

    @Override
    public Transaccion guardar(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    @Override
    public Optional<Transaccion> buscarPorId(Integer id) {
        return transaccionRepository.findById(id);
    }

    @Override
    public Transaccion actualizar(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    @Override
    public void eliminar(Integer id) {
        transaccionRepository.deleteById(id);

    }
}
