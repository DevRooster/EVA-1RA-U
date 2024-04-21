package com.example.msadmatricula.service;
import com.example.msadmatricula.entity.Estudiante;
import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    public List<Estudiante> listar();
    
    public Estudiante guardar(Estudiante estudiante);

    public Optional<Estudiante> buscarPorId(Integer id);

    public Estudiante actualizar(Estudiante estudiante);

    public void eliminar(Integer id);
}
