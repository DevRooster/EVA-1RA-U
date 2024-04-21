package com.example.msgestion_docentes.service;


import com.example.msgestion_docentes.entity.Evaluación;


import java.util.List;
import java.util.Optional;

public interface EvaluaciónService {
    List<Evaluación> lista();
    Evaluación guardar(Evaluación evaluación);
    Optional<Evaluación> buscarPorId(Integer id);
    Evaluación actualizar(Evaluación evaluación);
    void eleminar(Integer id);
}
