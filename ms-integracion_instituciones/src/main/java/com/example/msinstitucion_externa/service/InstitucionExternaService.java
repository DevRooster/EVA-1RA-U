package com.example.msinstitucion_externa.service;

import com.example.msinstitucion_externa.entity.InstitucionExterna;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface InstitucionExternaService {
    List<InstitucionExterna> lista();
    InstitucionExterna guardar(InstitucionExterna institucionExterna);
    Optional<InstitucionExterna> buscarPorId(Integer id);
    InstitucionExterna actualizar(InstitucionExterna institucionExterna);
    void eleminar(Integer id);
}
