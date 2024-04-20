package com.example.msinstitucion_externa.service.impl;

import com.example.msinstitucion_externa.entity.DatosCompartidos;
import com.example.msinstitucion_externa.repository.DatosCompartidosRepository;
import com.example.msinstitucion_externa.service.DatosCompartidosService;
import com.example.msinstitucion_externa.service.OtraUGELService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosCompartidosServiceImpl implements DatosCompartidosService {
    @Autowired
    private DatosCompartidosRepository datosCompartidosRepository;

    @Override
    public List<DatosCompartidos> lista() {
        return datosCompartidosRepository.findAll();
    }

    @Override
    public DatosCompartidos guardar(DatosCompartidos datosCompartidos) {
        return datosCompartidosRepository.save(datosCompartidos);
    }

    @Override
    public Optional<DatosCompartidos> buscarPorId(Integer id) {
        return datosCompartidosRepository.findById(id);
    }

    @Override
    public DatosCompartidos actualizar(DatosCompartidos datosCompartidos) {
        return datosCompartidosRepository.save(datosCompartidos);
    }

    @Override
    public void eleminar(Integer id) {
        datosCompartidosRepository.deleteById(id);

    }
}
