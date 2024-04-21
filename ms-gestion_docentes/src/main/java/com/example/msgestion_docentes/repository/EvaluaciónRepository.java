package com.example.msgestion_docentes.repository;


import com.example.msgestion_docentes.entity.Evaluación;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluaciónRepository extends JpaRepository<Evaluación,Integer> {
}
