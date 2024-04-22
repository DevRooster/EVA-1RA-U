package com.example.msadmatricula.service;
import com.example.msadmatricula.entity.Expediente;
import java.util.List;
import java.util.Optional;

public interface ExpedienteService {
    public List<Expediente> listar();
    
    public Expediente guardar(Expediente expediente);

    public Optional<Expediente> buscarPorId(Integer id);

    public Expediente actualizar(Expediente expediente);

    public void eliminar(Integer id);
}
