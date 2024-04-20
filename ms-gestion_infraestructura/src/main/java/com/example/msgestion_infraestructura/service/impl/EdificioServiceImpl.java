package com.example.msgestion_infraestructura.service.impl;

import com.example.msgestion_infraestructura.entity.Edificio;
import com.example.msgestion_infraestructura.repository.EdificioRepository;
import com.example.msgestion_infraestructura.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdificioServiceImpl implements EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    @Override
    public List<Edificio> lista() {
        return edificioRepository.findAll();
    }

    @Override
    public Edificio guardar(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public Optional<Edificio> buscarPorId(Integer id) {
        return edificioRepository.findById(id);
    }

    @Override
    public Edificio actualizar(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public void eliminar(Integer id) {
        edificioRepository.deleteById(id);

    }

}
