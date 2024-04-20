package com.example.msgestion_infraestructura.service.impl;

import com.example.msgestion_infraestructura.entity.Mantenimiento;
import com.example.msgestion_infraestructura.repository.MantenimientoRepository;
import com.example.msgestion_infraestructura.service.MantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MantenimientoServiceImpl implements MantenimientoService {

    @Autowired
    private MantenimientoRepository mantenimientoRepository;

    @Override
    public List<Mantenimiento> lista() {
        return mantenimientoRepository.findAll();
    }

    @Override
    public Mantenimiento guardar(Mantenimiento mantenimiento) {
        return mantenimientoRepository.save(mantenimiento);
    }

    @Override
    public Optional<Mantenimiento> buscarPorId(Integer id) {
        return mantenimientoRepository.findById(id);
    }

    @Override
    public Mantenimiento actualizar(Mantenimiento mantenimiento) {
        return mantenimientoRepository.save(mantenimiento);
    }

    @Override
    public void eliminar(Integer id) {
        mantenimientoRepository.deleteById(id);

    }
}
