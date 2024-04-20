package com.example.msmonitoreo_asistencia.repository;

import com.example.msmonitoreo_asistencia.entity.Estudiante;
import com.example.msmonitoreo_asistencia.entity.RegistroAsistencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroAsistenciaRepository extends JpaRepository<RegistroAsistencia,Integer> {
}
