package com.example.mssoporteasistencia.service.impl;


import com.example.mssoporteasistencia.entity.SolicitudSoporte;
import com.example.mssoporteasistencia.repository.SolicitudSoporteRepository;
import com.example.mssoporteasistencia.service.SolicitudSoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SolicitudSoporteServiceImpl implements SolicitudSoporteService {
    @Autowired
    private SolicitudSoporteRepository solicitudSoporteRepository;

    @Override
    public List<SolicitudSoporte> lista() {
        return solicitudSoporteRepository.findAll();
    }

    @Override
    public SolicitudSoporte guardar(SolicitudSoporte solicitudSoporte) {
        return solicitudSoporteRepository.save(solicitudSoporte);
    }

    @Override
    public Optional<SolicitudSoporte> buscarPorId(Integer id) {
        return solicitudSoporteRepository.findById(id);
    }

    @Override
    public SolicitudSoporte actualizar(SolicitudSoporte solicitudSoporte) {
        return solicitudSoporteRepository.save(solicitudSoporte);
    }

    @Override
    public void eleminar(Integer id) {
        solicitudSoporteRepository.deleteById(id);

    }
}
