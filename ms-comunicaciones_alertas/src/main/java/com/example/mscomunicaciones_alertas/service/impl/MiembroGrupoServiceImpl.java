package com.example.mscomunicaciones_alertas.service.impl;

import com.example.mscomunicaciones_alertas.entity.MiembroGrupo;
import com.example.mscomunicaciones_alertas.repository.MiembroGrupoRepository;
import com.example.mscomunicaciones_alertas.service.MiembroGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MiembroGrupoServiceImpl implements MiembroGrupoService {

    @Autowired
    private MiembroGrupoRepository miembroGrupoRepository;

    @Override
    public List<MiembroGrupo> lista() {
        return miembroGrupoRepository.findAll();
    }

    @Override
    public MiembroGrupo guardar(MiembroGrupo miembroGrupo) {
        return miembroGrupoRepository.save(miembroGrupo);
    }

    @Override
    public Optional<MiembroGrupo> buscarPorId(Integer id) {
        return miembroGrupoRepository.findById(id);
    }

    @Override
    public MiembroGrupo actualizar(MiembroGrupo miembroGrupo) {
        return miembroGrupoRepository.save(miembroGrupo);
    }

    @Override
    public void eliminar(Integer id) {
        miembroGrupoRepository.deleteById(id);

    }
}
