package com.example.msreportanalisis.service;

import com.example.msreportanalisis.entity.Mensaje;
import java.util.List;
import java.util.Optional;

public interface MensajeService {
    public List<Mensaje> listar();
    
    public Mensaje guardar(Mensaje mensaje);

    public Optional<Mensaje> buscarPorId(Integer id);

    public Mensaje actualizar(Mensaje mensaje);

    public void eliminar(Integer id);
}
