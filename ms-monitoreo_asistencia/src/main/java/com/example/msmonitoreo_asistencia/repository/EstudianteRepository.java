package com.example.msmonitoreo_asistencia.repository;

import com.example.msmonitoreo_asistencia.entity.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {
}
