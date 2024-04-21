package com.example.mscomunicaciones_alertas.service.impl;

import com.example.mscomunicaciones_alertas.entity.Alerta;
import com.example.mscomunicaciones_alertas.repository.AlertaRepository;
import com.example.mscomunicaciones_alertas.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertaServiceImpl implements AlertaService {

    @Autowired
    private AlertaRepository alertaRepository;

    @Override
    public List<Alerta> lista() {
        return alertaRepository.findAll();
    }

    @Override
    public Alerta guardar(Alerta alerta) {
        return alertaRepository.save(alerta);
    }

    @Override
    public Optional<Alerta> buscarPorId(Integer id) {
        return alertaRepository.findById(id);
    }

    @Override
    public Alerta actualizar(Alerta alerta) {
        return alertaRepository.save(alerta);
    }

    @Override
    public void eliminar(Integer id) {
        alertaRepository.deleteById(id);

    }
}
