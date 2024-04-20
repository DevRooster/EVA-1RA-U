package com.example.msinstitucion_externa.service.impl;

import com.example.msinstitucion_externa.entity.ConvenioAcuerdo;
import com.example.msinstitucion_externa.repository.ConvenioAcuerdoRepository;
import com.example.msinstitucion_externa.service.ConvenioAcuerdoService;
import com.example.msinstitucion_externa.service.OtraUGELService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConvenioAcuerdoServiceImpl implements ConvenioAcuerdoService {
    @Autowired
    private ConvenioAcuerdoRepository convenioAcuerdoRepository;

    @Override
    public List<ConvenioAcuerdo> lista() {
        return convenioAcuerdoRepository.findAll();
    }

    @Override
    public ConvenioAcuerdo guardar(ConvenioAcuerdo convenioAcuerdo) {
        return convenioAcuerdoRepository.save(convenioAcuerdo);
    }

    @Override
    public Optional<ConvenioAcuerdo> buscarPorId(Integer id) {
        return convenioAcuerdoRepository.findById(id);
    }

    @Override
    public ConvenioAcuerdo actualizar(ConvenioAcuerdo convenioAcuerdo) {
        return convenioAcuerdoRepository.save(convenioAcuerdo);
    }

    @Override
    public void eleminar(Integer id) {
        convenioAcuerdoRepository.deleteById(id);

    }
}
