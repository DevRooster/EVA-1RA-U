package com.example.msgestion_financiera.service.impl;

import com.example.msgestion_financiera.entity.Ingreso;
import com.example.msgestion_financiera.repository.IngresoRepository;
import com.example.msgestion_financiera.service.IngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngresoServiceImpl implements IngresoService {

    @Autowired
    private IngresoRepository ingresoRepository;

    @Override
    public List<Ingreso> lista() {
        return ingresoRepository.findAll();
    }

    @Override
    public Ingreso guardar(Ingreso ingreso) {
        return ingresoRepository.save(ingreso);
    }

    @Override
    public Optional<Ingreso> buscarPorId(Integer id) {
        return ingresoRepository.findById(id);
    }

    @Override
    public Ingreso actualizar(Ingreso ingreso) {
        return ingresoRepository.save(ingreso);
    }

    @Override
    public void eliminar(Integer id) {
        ingresoRepository.deleteById(id);

    }
}
