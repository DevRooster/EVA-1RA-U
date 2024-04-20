package com.example.msinstitucion_externa.service.impl;

import com.example.msinstitucion_externa.entity.InstitucionExterna;
import com.example.msinstitucion_externa.repository.InstitucionExternaRepository;
import com.example.msinstitucion_externa.service.InstitucionExternaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstitucionExternaServiceImpl implements InstitucionExternaService {
    @Autowired
    private InstitucionExternaRepository institucionExternaRepository;

    @Override
    public List<InstitucionExterna> lista() {
        return institucionExternaRepository.findAll();
    }

    @Override
    public InstitucionExterna guardar(InstitucionExterna institucionExterna) {
        return institucionExternaRepository.save(institucionExterna);
    }

    @Override
    public Optional<InstitucionExterna> buscarPorId(Integer id) {
        return institucionExternaRepository.findById(id);
    }

    @Override
    public InstitucionExterna actualizar(InstitucionExterna institucionExterna) {
        return institucionExternaRepository.save(institucionExterna);
    }

    @Override
    public void eleminar(Integer id) {
        institucionExternaRepository.deleteById(id);

    }
}
