package com.example.mscomunicaciones_alertas.service.impl;

import com.example.mscomunicaciones_alertas.entity.Mensaje;
import com.example.mscomunicaciones_alertas.repository.MensajeRepository;
import com.example.mscomunicaciones_alertas.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeServiceImpl implements MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    @Override
    public List<Mensaje> lista() {
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
