package com.example.msplanificacion_curricular.repository;


import com.example.msplanificacion_curricular.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository <Curso,Integer> {
}
