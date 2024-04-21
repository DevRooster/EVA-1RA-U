package com.example.msplanificacion_curricular.service.impl;

import com.example.msplanificacion_curricular.entity.PlanEstudios;
import com.example.msplanificacion_curricular.repository.PlanEstudiosRepository;
import com.example.msplanificacion_curricular.service.PlanEstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlanEstudiosServiceImpl implements PlanEstudiosService {
    @Autowired
    private PlanEstudiosRepository planEstudiosRepository;

    @Override
    public List<PlanEstudios> lista() {
        return planEstudiosRepository.findAll();
    }

    @Override
    public PlanEstudios guardar(PlanEstudios planEstudios) {
        return planEstudiosRepository.save(planEstudios);
    }

    @Override
    public Optional<PlanEstudios> buscarPorId(Integer id) {
        return planEstudiosRepository.findById(id);
    }

    @Override
    public PlanEstudios actualizar(PlanEstudios planEstudios) {
        return planEstudiosRepository.save(planEstudios);
    }

    @Override
    public void eleminar(Integer id) {
        planEstudiosRepository.deleteById(id);

    }
}
