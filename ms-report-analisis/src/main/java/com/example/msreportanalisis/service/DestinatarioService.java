package com.example.msreportanalisis.service;

import com.example.msreportanalisis.entity.Destinatario;
import java.util.List;
import java.util.Optional;

public interface DestinatarioService {
    public List<Destinatario> listar();
    
    public Destinatario guardar(Destinatario destinatario);

    public Optional<Destinatario> buscarPorId(Integer id);

    public Destinatario actualizar(Destinatario destinatario);

    public void eliminar(Integer id);
}
