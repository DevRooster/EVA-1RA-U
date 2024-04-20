package com.example.msmonitoreo_asistencia.service;

import com.example.msmonitoreo_asistencia.entity.RegistroAsistencia;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface RegistroAsistenciaService {
    List<RegistroAsistencia> lista();
    RegistroAsistencia guardar(RegistroAsistencia registroAsistencia);
    Optional<RegistroAsistencia> buscarPorId(Integer id);
    RegistroAsistencia actualizar(RegistroAsistencia registroAsistencia);
    void eleminar(Integer id);
}
