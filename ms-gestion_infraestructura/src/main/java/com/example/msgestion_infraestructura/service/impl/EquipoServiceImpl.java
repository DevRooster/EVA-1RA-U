package com.example.msgestion_infraestructura.service.impl;

import com.example.msgestion_infraestructura.entity.Equipo;
import com.example.msgestion_infraestructura.repository.EquipoRepository;
import com.example.msgestion_infraestructura.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoServiceImpl implements EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public List<Equipo> lista() {
        return equipoRepository.findAll();
    }

    @Override
    public Equipo guardar(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public Optional<Equipo> buscarPorId(Integer id) {
        return equipoRepository.findById(id);
    }

    @Override
    public Equipo actualizar(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public void eliminar(Integer id) {
        equipoRepository.deleteById(id);

    }
}
