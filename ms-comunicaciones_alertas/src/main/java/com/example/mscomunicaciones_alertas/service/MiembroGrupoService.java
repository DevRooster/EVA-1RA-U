package com.example.mscomunicaciones_alertas.service;

import com.example.mscomunicaciones_alertas.entity.MiembroGrupo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MiembroGrupoService {
    List<MiembroGrupo> lista();
    MiembroGrupo guardar(MiembroGrupo miembroGrupo);
    Optional<MiembroGrupo> buscarPorId(Integer id);
    MiembroGrupo actualizar(MiembroGrupo miembroGrupo);
    void eliminar(Integer id);
}
