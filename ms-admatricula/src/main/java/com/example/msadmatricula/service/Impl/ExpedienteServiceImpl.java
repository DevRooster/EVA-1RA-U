package com.example.msadmatricula.service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.msadmatricula.entity.Expediente;
import com.example.msadmatricula.repository.ExpedienteRepository;
import com.example.msadmatricula.service.ExpedienteService;

@Service
public class ExpedienteServiceImpl implements ExpedienteService{
    @Autowired
    private ExpedienteRepository expedienteRepository;

    @Override
    public List<Expediente> listar() {
        return expedienteRepository.findAll();
    }

    @Override
    public Expediente guardar(Expediente expediente) {
        return expedienteRepository.save(expediente);
    }

    @Override
    public Optional<Expediente> buscarPorId(Integer id) {
        return expedienteRepository.findById(id);
    }

    @Override
    public Expediente actualizar(Expediente expediente) {
        return expedienteRepository.save(expediente);
    }

    @Override
    public void eliminar(Integer id) {
        expedienteRepository.deleteById(id);
    }
}
