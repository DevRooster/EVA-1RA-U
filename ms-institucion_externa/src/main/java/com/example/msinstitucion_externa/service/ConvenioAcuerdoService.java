package com.example.msinstitucion_externa.service;

import com.example.msinstitucion_externa.entity.ConvenioAcuerdo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ConvenioAcuerdoService {
    List<ConvenioAcuerdo> lista();
    ConvenioAcuerdo guardar(ConvenioAcuerdo convenioAcuerdo);
    Optional<ConvenioAcuerdo> buscarPorId(Integer id);
    ConvenioAcuerdo actualizar(ConvenioAcuerdo convenioAcuerdo);
    void eleminar(Integer id);
}
