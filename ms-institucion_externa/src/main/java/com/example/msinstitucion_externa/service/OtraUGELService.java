package com.example.msinstitucion_externa.service;

import com.example.msinstitucion_externa.entity.OtraUGEL;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface OtraUGELService {
    List<OtraUGEL> lista();
    OtraUGEL guardar(OtraUGEL otraUGEL);
    Optional<OtraUGEL> buscarPorId(Integer id);
    OtraUGEL actualizar(OtraUGEL otraUGEL);
    void eleminar(Integer id);
}
