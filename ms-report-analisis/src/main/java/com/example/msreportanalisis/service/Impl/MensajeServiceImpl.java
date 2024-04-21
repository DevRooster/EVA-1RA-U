package com.example.msreportanalisis.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msreportanalisis.entity.Mensaje;
import com.example.msreportanalisis.repository.MensajeRepository;
import com.example.msreportanalisis.service.MensajeService;

@Service
public class MensajeServiceImpl implements MensajeService{
    @Autowired
    private MensajeRepository mensajeRepository;

    @Override
    public List<Mensaje> listar() {
        return mensajeRepository.findAll();
    }

    @Override
    public Mensaje guardar(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    @Override
    public Optional<Mensaje> buscarPorId(Integer id) {
        return mensajeRepository.findById(id);
    }

    @Override
    public Mensaje actualizar(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    @Override
    public void eliminar(Integer id) {
        mensajeRepository.deleteById(id);
    }
}
