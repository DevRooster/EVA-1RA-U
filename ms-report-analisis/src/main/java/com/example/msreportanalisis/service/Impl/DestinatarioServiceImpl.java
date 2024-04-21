package com.example.msreportanalisis.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msreportanalisis.entity.Destinatario;
import com.example.msreportanalisis.repository.DestinatarioRepository;
import com.example.msreportanalisis.service.DestinatarioService;

@Service
public class DestinatarioServiceImpl implements DestinatarioService{
    @Autowired
    private DestinatarioRepository destinatarioRepository;

    @Override
    public List<Destinatario> listar() {
        return destinatarioRepository.findAll();
    }

    @Override
    public Destinatario guardar(Destinatario destinatario) {
        return destinatarioRepository.save(destinatario);
    }

    @Override
    public Optional<Destinatario> buscarPorId(Integer id) {
        return destinatarioRepository.findById(id);
    }

    @Override
    public Destinatario actualizar(Destinatario destinatario) {
        return destinatarioRepository.save(destinatario);
    }

    @Override
    public void eliminar(Integer id) {
        destinatarioRepository.deleteById(id);
    }
}
