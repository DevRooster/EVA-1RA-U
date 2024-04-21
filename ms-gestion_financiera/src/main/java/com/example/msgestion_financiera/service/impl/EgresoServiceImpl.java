package com.example.msgestion_financiera.service.impl;

import com.example.msgestion_financiera.entity.Egreso;
import com.example.msgestion_financiera.repository.EgresoRepository;
import com.example.msgestion_financiera.service.EgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EgresoServiceImpl implements EgresoService {

    @Autowired
    private EgresoRepository egresoRepository;

    @Override
    public List<Egreso> lista() {
        return egresoRepository.findAll();
    }

    @Override
    public Egreso guardar(Egreso egreso) {
        return egresoRepository.save(egreso);
    }

    @Override
    public Optional<Egreso> buscarPorId(Integer id) {
        return egresoRepository.findById(id);
    }

    @Override
    public Egreso actualizar(Egreso egreso) {
        return egresoRepository.save(egreso);
    }

    @Override
    public void eliminar(Integer id) {
        egresoRepository.deleteById(id);

    }
}
