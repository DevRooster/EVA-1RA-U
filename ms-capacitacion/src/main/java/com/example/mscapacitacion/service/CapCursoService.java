package com.example.mscapacitacion.service;
import com.example.mscapacitacion.entity.CapCurso;
import java.util.List;
import java.util.Optional;

public interface CapCursoService {
    public List<CapCurso> listar();
    
    public CapCurso guardar(CapCurso capcurso);

    public Optional<CapCurso> buscarPorId(Integer id);

    public CapCurso actualizar(CapCurso capcurso);

    public void eliminar(Integer id);
}
